package com.hadoop.monitor.utils;

import com.hadoop.monitor.MonitorMetrics;
import com.hadoop.monitor.StatefulHttpClient;
import com.hadoop.monitor.entity.QueueMetrics;
import com.hadoop.monitor.entity.YarnApplication;
import com.hadoop.monitor.entity.YarnClusterMetrics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName YarnUtils
 * @Description TODO
 * @Autor yanni
 * @Date 2020/4/10 17:42
 * @Version 1.0
 **/
public class YarnUtils {

    private static final String YarnUri = "http://192.168.xx.xx:8088";
    private static final String FETCH_Application = "/ws/v1/cluster/apps/";
    private static final String FETCH_Yarn_Info = "%s/jmx?qry=%s";
    private static final String ClusterMetrics = "Hadoop:service=ResourceManager,name=ClusterMetrics";
    private static final String QueueMetrics = "Hadoop:service=ResourceManager,name=QueueMetrics,q0=root";
    private static final Logger LOGGER = LoggerFactory.getLogger(YarnUtils.class);

    private static String readAll(Reader rd) throws IOException {
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = rd.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }

    public static JSONObject readJsonFromUrl(String url) throws IOException, JSONException {
        InputStream is = new URL(url).openStream();
        try {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
            String jsonText = readAll(rd);
            JSONObject json = new JSONObject(jsonText);
            return json;
        } finally {
            is.close();
        }
    }

    /**
     * 查看集群状态信息
     * @param client
     * @throws IOException
     */
    public static YarnClusterMetrics fetchClusterMetrics(StatefulHttpClient client) throws IOException {
        YarnClusterMetrics yarnClusterMetrics = new YarnClusterMetrics();
        String namenodeUrl = String.format(FETCH_Yarn_Info, YarnUri, ClusterMetrics);
        MonitorMetrics monitorMetrics = client.get(MonitorMetrics.class, namenodeUrl, null, null);
        yarnClusterMetrics.setHostname(monitorMetrics.getMetricsValue("tag.Hostname").toString());
        yarnClusterMetrics.setModelerType(monitorMetrics.getMetricsValue("modelerType").toString());
        yarnClusterMetrics.setNumActiveNMs((int)monitorMetrics.getMetricsValue("NumActiveNMs"));
        yarnClusterMetrics.setNumUnhealthyNMs((int)monitorMetrics.getMetricsValue("NumUnhealthyNMs"));
        yarnClusterMetrics.setNumLostNMs((int)monitorMetrics.getMetricsValue("NumLostNMs"));
        yarnClusterMetrics.setNumRebootedNMs((int)monitorMetrics.getMetricsValue("NumRebootedNMs"));

        return yarnClusterMetrics;
    }

    /**
     * 查询Queue资源使用情况
     * @param client
     * @return
     * @throws IOException
     */
    public static com.hadoop.monitor.entity.QueueMetrics fetchQueueMetrics(StatefulHttpClient client) throws IOException {
        QueueMetrics queueMetrics = new QueueMetrics();
        String namenodeUrl = String.format(FETCH_Yarn_Info, YarnUri, QueueMetrics);
        MonitorMetrics monitorMetrics = client.get(MonitorMetrics.class, namenodeUrl, null, null);

        queueMetrics.setModelerType(monitorMetrics.getMetricsValue("modelerType").toString());
        queueMetrics.setQueue(monitorMetrics.getMetricsValue("tag.Queue").toString());
        queueMetrics.setHostname(monitorMetrics.getMetricsValue("tag.Hostname").toString());
        queueMetrics.setAppsSubmitted((int)monitorMetrics.getMetricsValue("AppsSubmitted"));
        queueMetrics.setAppsRunning((int)monitorMetrics.getMetricsValue("AppsRunning"));
        queueMetrics.setAppsPending((int)monitorMetrics.getMetricsValue("AppsPending"));
        queueMetrics.setAppsCompleted((int)monitorMetrics.getMetricsValue("AppsCompleted"));
        queueMetrics.setAppsKilled((int)monitorMetrics.getMetricsValue("AppsKilled"));
        queueMetrics.setAppsFailed((int)monitorMetrics.getMetricsValue("AppsFailed"));
        queueMetrics.setAllocatedMB((int)monitorMetrics.getMetricsValue("AllocatedMB"));
        queueMetrics.setAllocatedVCores((int)monitorMetrics.getMetricsValue("AllocatedVCores"));
        queueMetrics.setAllocatedContainers((int)monitorMetrics.getMetricsValue("AllocatedContainers"));
        queueMetrics.setAvailableMB((int)monitorMetrics.getMetricsValue("AvailableMB"));
        queueMetrics.setAvailableVCores((int)monitorMetrics.getMetricsValue("AvailableVCores"));
        queueMetrics.setPendingMB((int)monitorMetrics.getMetricsValue("PendingMB"));
        queueMetrics.setPendingVCores((int)monitorMetrics.getMetricsValue("PendingVCores"));
        queueMetrics.setPendingContainers((int)monitorMetrics.getMetricsValue("PendingContainers"));
        queueMetrics.setReservedMB((int)monitorMetrics.getMetricsValue("ReservedMB"));
        queueMetrics.setReservedVCores((int)monitorMetrics.getMetricsValue("ReservedVCores"));
        queueMetrics.setReservedContainers((int)monitorMetrics.getMetricsValue("ReservedContainers"));
        queueMetrics.setActiveApplications((int)monitorMetrics.getMetricsValue("ActiveApplications"));

        return queueMetrics;
    }

    /**
     * 查看job信息
     * @return
     * @throws IOException
     * @throws JSONException
     */
    public static List<YarnApplication> fetchApp() throws IOException, JSONException {
        ArrayList<YarnApplication> list = new ArrayList<>();
        JSONObject json = readJsonFromUrl(YarnUri+FETCH_Application);
        //System.out.println(json.toString());
        if (json.toString().equals("{\"apps\":null}")){
            LOGGER.error("无job信息,请检查yarn页面");
            System.exit(1);
        }
        JSONObject apps=json.getJSONObject("apps");
        JSONArray app=apps.getJSONArray("app");
        for(int i=0;i<app.length();i++) {
            JSONObject info = app.getJSONObject(i);
            YarnApplication yarnApplication = new YarnApplication();
            yarnApplication.setId(info.getString("id"));
            yarnApplication.setUser(info.getString("user"));
            yarnApplication.setName(info.getString("name"));
            yarnApplication.setQueue(info.getString("queue"));
            yarnApplication.setState(info.getString("state"));
            yarnApplication.setFinalStatus(info.getString("finalStatus"));
            yarnApplication.setProgress(info.getInt("progress"));
            yarnApplication.setTrackingUI(info.getString("trackingUI"));
            yarnApplication.setDiagnostics(info.getString("diagnostics"));
            yarnApplication.setClusterId(info.getLong("clusterId"));
            yarnApplication.setApplicationType(info.getString("applicationType"));
            yarnApplication.setApplicationTags(info.getString("applicationTags"));
            yarnApplication.setStartedTime(info.getLong("startedTime"));
            yarnApplication.setFinishedTime(info.getLong("finishedTime"));
            yarnApplication.setElapsedTime(info.getLong("elapsedTime"));
            yarnApplication.setAmContainerLogs(info.getString("amContainerLogs"));
            yarnApplication.setAmHostHttpAddress(info.getString("amHostHttpAddress"));
            yarnApplication.setAllocatedMB(info.getInt("allocatedMB"));
            yarnApplication.setAllocatedVCores(info.getInt("allocatedVCores"));
            yarnApplication.setReservedMB(info.getInt("reservedMB"));
            yarnApplication.setReservedVCores(info.getInt("reservedVCores"));
            yarnApplication.setRunningContainers(info.getInt("runningContainers"));
            yarnApplication.setMemorySeconds(info.getInt("memorySeconds"));
            yarnApplication.setVcoreSeconds(info.getInt("vcoreSeconds"));
            yarnApplication.setPreemptedResourceMB(info.getInt("preemptedResourceMB"));
            yarnApplication.setPreemptedResourceVCores(info.getInt("preemptedResourceVCores"));
            yarnApplication.setNumNonAMContainerPreempted(info.getInt("numNonAMContainerPreempted"));
            yarnApplication.setNumAMContainerPreempted(info.getInt("numAMContainerPreempted"));
            yarnApplication.setLogAggregationStatus(info.getString("logAggregationStatus"));

            list.add(yarnApplication);
        }

        return list;
    }
}
