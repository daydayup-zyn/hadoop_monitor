package com.hadoop.monitor.entity;

/**
 * @ClassName YarnApplication
 * @Description TODO yarn页面job类
 * @Autor yanni
 * @Date 2020/4/10 14:57
 * @Version 1.0
 **/
public class YarnApplication {

    private String id;
    private String user;
    private String name;
    private String queue;
    private String state;
    private String finalStatus;
    private int progress;
    private String trackingUI;
    private String diagnostics;
    private Long clusterId;
    private String applicationType;
    private String applicationTags;
    private Long startedTime;
    private Long finishedTime;
    private Long elapsedTime;
    private String amContainerLogs;
    private String amHostHttpAddress;
    private int allocatedMB;
    private int allocatedVCores;
    private int reservedMB;
    private int reservedVCores;
    private int runningContainers;
    private int memorySeconds;
    private int vcoreSeconds;
    private int preemptedResourceMB;
    private int preemptedResourceVCores;
    private int numNonAMContainerPreempted;
    private int numAMContainerPreempted;
    private String logAggregationStatus;

    public YarnApplication() {
        this.id = id;
        this.user = user;
        this.name = name;
        this.queue = queue;
        this.state = state;
        this.finalStatus = finalStatus;
        this.progress = progress;
        this.trackingUI = trackingUI;
        this.diagnostics = diagnostics;
        this.clusterId = clusterId;
        this.applicationType = applicationType;
        this.applicationTags = applicationTags;
        this.startedTime = startedTime;
        this.finishedTime = finishedTime;
        this.elapsedTime = elapsedTime;
        this.amContainerLogs = amContainerLogs;
        this.amHostHttpAddress = amHostHttpAddress;
        this.allocatedMB = allocatedMB;
        this.allocatedVCores = allocatedVCores;
        this.reservedMB = reservedMB;
        this.reservedVCores = reservedVCores;
        this.runningContainers = runningContainers;
        this.memorySeconds = memorySeconds;
        this.vcoreSeconds = vcoreSeconds;
        this.preemptedResourceMB = preemptedResourceMB;
        this.preemptedResourceVCores = preemptedResourceVCores;
        this.numNonAMContainerPreempted = numNonAMContainerPreempted;
        this.numAMContainerPreempted = numAMContainerPreempted;
        this.logAggregationStatus = logAggregationStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getFinalStatus() {
        return finalStatus;
    }

    public void setFinalStatus(String finalStatus) {
        this.finalStatus = finalStatus;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getTrackingUI() {
        return trackingUI;
    }

    public void setTrackingUI(String trackingUI) {
        this.trackingUI = trackingUI;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public void setDiagnostics(String diagnostics) {
        this.diagnostics = diagnostics;
    }

    public Long getClusterId() {
        return clusterId;
    }

    public void setClusterId(Long clusterId) {
        this.clusterId = clusterId;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.applicationType = applicationType;
    }

    public String getApplicationTags() {
        return applicationTags;
    }

    public void setApplicationTags(String applicationTags) {
        this.applicationTags = applicationTags;
    }

    public Long getStartedTime() {
        return startedTime;
    }

    public void setStartedTime(Long startedTime) {
        this.startedTime = startedTime;
    }

    public Long getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Long finishedTime) {
        this.finishedTime = finishedTime;
    }

    public Long getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Long elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public String getAmContainerLogs() {
        return amContainerLogs;
    }

    public void setAmContainerLogs(String amContainerLogs) {
        this.amContainerLogs = amContainerLogs;
    }

    public String getAmHostHttpAddress() {
        return amHostHttpAddress;
    }

    public void setAmHostHttpAddress(String amHostHttpAddress) {
        this.amHostHttpAddress = amHostHttpAddress;
    }

    public int getAllocatedMB() {
        return allocatedMB;
    }

    public void setAllocatedMB(int allocatedMB) {
        this.allocatedMB = allocatedMB;
    }

    public int getAllocatedVCores() {
        return allocatedVCores;
    }

    public void setAllocatedVCores(int allocatedVCores) {
        this.allocatedVCores = allocatedVCores;
    }

    public int getReservedMB() {
        return reservedMB;
    }

    public void setReservedMB(int reservedMB) {
        this.reservedMB = reservedMB;
    }

    public int getReservedVCores() {
        return reservedVCores;
    }

    public void setReservedVCores(int reservedVCores) {
        this.reservedVCores = reservedVCores;
    }

    public int getRunningContainers() {
        return runningContainers;
    }

    public void setRunningContainers(int runningContainers) {
        this.runningContainers = runningContainers;
    }

    public int getMemorySeconds() {
        return memorySeconds;
    }

    public void setMemorySeconds(int memorySeconds) {
        this.memorySeconds = memorySeconds;
    }

    public int getVcoreSeconds() {
        return vcoreSeconds;
    }

    public void setVcoreSeconds(int vcoreSeconds) {
        this.vcoreSeconds = vcoreSeconds;
    }

    public int getPreemptedResourceMB() {
        return preemptedResourceMB;
    }

    public void setPreemptedResourceMB(int preemptedResourceMB) {
        this.preemptedResourceMB = preemptedResourceMB;
    }

    public int getPreemptedResourceVCores() {
        return preemptedResourceVCores;
    }

    public void setPreemptedResourceVCores(int preemptedResourceVCores) {
        this.preemptedResourceVCores = preemptedResourceVCores;
    }

    public int getNumNonAMContainerPreempted() {
        return numNonAMContainerPreempted;
    }

    public void setNumNonAMContainerPreempted(int numNonAMContainerPreempted) {
        this.numNonAMContainerPreempted = numNonAMContainerPreempted;
    }

    public int getNumAMContainerPreempted() {
        return numAMContainerPreempted;
    }

    public void setNumAMContainerPreempted(int numAMContainerPreempted) {
        this.numAMContainerPreempted = numAMContainerPreempted;
    }

    public String getLogAggregationStatus() {
        return logAggregationStatus;
    }

    public void setLogAggregationStatus(String logAggregationStatus) {
        this.logAggregationStatus = logAggregationStatus;
    }

    @Override
    public String toString() {
        return "YarnApplication{" +
                "id='" + id + '\'' +
                ", user='" + user + '\'' +
                ", name='" + name + '\'' +
                ", queue='" + queue + '\'' +
                ", state='" + state + '\'' +
                ", finalStatus='" + finalStatus + '\'' +
                ", progress=" + progress +
                ", trackingUI='" + trackingUI + '\'' +
                ", diagnostics='" + diagnostics + '\'' +
                ", clusterId=" + clusterId +
                ", applicationType='" + applicationType + '\'' +
                ", applicationTags='" + applicationTags + '\'' +
                ", startedTime=" + startedTime +
                ", finishedTime=" + finishedTime +
                ", elapsedTime=" + elapsedTime +
                ", amContainerLogs='" + amContainerLogs + '\'' +
                ", amHostHttpAddress='" + amHostHttpAddress + '\'' +
                ", allocatedMB=" + allocatedMB +
                ", allocatedVCores=" + allocatedVCores +
                ", reservedMB=" + reservedMB +
                ", reservedVCores=" + reservedVCores +
                ", runningContainers=" + runningContainers +
                ", memorySeconds=" + memorySeconds +
                ", vcoreSeconds=" + vcoreSeconds +
                ", preemptedResourceMB=" + preemptedResourceMB +
                ", preemptedResourceVCores=" + preemptedResourceVCores +
                ", numNonAMContainerPreempted=" + numNonAMContainerPreempted +
                ", numAMContainerPreempted=" + numAMContainerPreempted +
                ", logAggregationStatus='" + logAggregationStatus + '\'' +
                '}';
    }
}
