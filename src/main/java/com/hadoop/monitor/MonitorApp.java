package com.hadoop.monitor;


import com.hadoop.monitor.entity.HdfsSummary;
import com.hadoop.monitor.entity.QueueMetrics;
import com.hadoop.monitor.entity.YarnApplication;
import com.hadoop.monitor.entity.YarnClusterMetrics;
import com.hadoop.monitor.utils.HadoopUtil;
import com.hadoop.monitor.utils.YarnUtils;
import org.json.JSONException;

import java.io.IOException;
import java.util.List;

/**
 * 测试
 */
public class MonitorApp {

    public static void main(String[] args) throws IOException, JSONException {

        //查询Hadoop信息
        StatefulHttpClient client = new StatefulHttpClient(null);
        HdfsSummary hdfsSummary = HadoopUtil.getHdfsSummary(client);
        hdfsSummary.printInfo();

        //查询HBASE信息
//        HbaseSummary hbaseSummary = HBaseUtil.getHbaseSummary(client);
//        hbaseSummary.printInfo();

        //查询application的信息
//        List<YarnApplication> list = YarnUtils.fetchApp();
//        for (YarnApplication yarnApplication:list){
//            System.out.println(yarnApplication.toString());
//        }

        //查询yarnClusterMetrics信息
//        YarnClusterMetrics yarnClusterMetrics = YarnUtils.fetchClusterMetrics(client);
//        Integer numActiveNMs = yarnClusterMetrics.getNumActiveNMs();
//        System.out.println(numActiveNMs);

        //查询队列资源使用情况
//        QueueMetrics queueMetrics = YarnUtils.fetchQueueMetrics(client);
//        Integer availableMB = queueMetrics.getAvailableMB();
//        System.out.println(availableMB);
    }
}
