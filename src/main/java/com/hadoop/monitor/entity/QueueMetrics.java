package com.hadoop.monitor.entity;

/**
 * @ClassName QueueMetrics
 * @Description TODO
 * @Autor yanni
 * @Date 2020/4/13 10:06
 * @Version 1.0
 **/
public class QueueMetrics {

    private String modelerType;
    private String Queue;
    private String Hostname;
    private Integer AppsSubmitted;
    private Integer AppsRunning;
    private Integer AppsPending;
    private Integer AppsCompleted;
    private Integer AppsKilled;
    private Integer AppsFailed;
    private Integer AllocatedMB;
    private Integer AllocatedVCores;
    private Integer AllocatedContainers;
    private Integer AvailableMB;
    private Integer AvailableVCores;
    private Integer PendingMB;
    private Integer PendingVCores;
    private Integer PendingContainers;
    private Integer ReservedMB;
    private Integer ReservedVCores;
    private Integer ReservedContainers;
    private Integer ActiveApplications;

    public String getModelerType() {
        return modelerType;
    }

    public void setModelerType(String modelerType) {
        this.modelerType = modelerType;
    }

    public String getQueue() {
        return Queue;
    }

    public void setQueue(String queue) {
        Queue = queue;
    }

    public String getHostname() {
        return Hostname;
    }

    public void setHostname(String hostname) {
        Hostname = hostname;
    }

    public Integer getAppsSubmitted() {
        return AppsSubmitted;
    }

    public void setAppsSubmitted(Integer appsSubmitted) {
        AppsSubmitted = appsSubmitted;
    }

    public Integer getAppsRunning() {
        return AppsRunning;
    }

    public void setAppsRunning(Integer appsRunning) {
        AppsRunning = appsRunning;
    }

    public Integer getAppsPending() {
        return AppsPending;
    }

    public void setAppsPending(Integer appsPending) {
        AppsPending = appsPending;
    }

    public Integer getAppsCompleted() {
        return AppsCompleted;
    }

    public void setAppsCompleted(Integer appsCompleted) {
        AppsCompleted = appsCompleted;
    }

    public Integer getAppsKilled() {
        return AppsKilled;
    }

    public void setAppsKilled(Integer appsKilled) {
        AppsKilled = appsKilled;
    }

    public Integer getAppsFailed() {
        return AppsFailed;
    }

    public void setAppsFailed(Integer appsFailed) {
        AppsFailed = appsFailed;
    }

    public Integer getAllocatedMB() {
        return AllocatedMB;
    }

    public void setAllocatedMB(Integer allocatedMB) {
        AllocatedMB = allocatedMB;
    }

    public Integer getAllocatedVCores() {
        return AllocatedVCores;
    }

    public void setAllocatedVCores(Integer allocatedVCores) {
        AllocatedVCores = allocatedVCores;
    }

    public Integer getAllocatedContainers() {
        return AllocatedContainers;
    }

    public void setAllocatedContainers(Integer allocatedContainers) {
        AllocatedContainers = allocatedContainers;
    }

    public Integer getAvailableMB() {
        return AvailableMB;
    }

    public void setAvailableMB(Integer availableMB) {
        AvailableMB = availableMB;
    }

    public Integer getAvailableVCores() {
        return AvailableVCores;
    }

    public void setAvailableVCores(Integer availableVCores) {
        AvailableVCores = availableVCores;
    }

    public Integer getPendingMB() {
        return PendingMB;
    }

    public void setPendingMB(Integer pendingMB) {
        PendingMB = pendingMB;
    }

    public Integer getPendingVCores() {
        return PendingVCores;
    }

    public void setPendingVCores(Integer pendingVCores) {
        PendingVCores = pendingVCores;
    }

    public Integer getPendingContainers() {
        return PendingContainers;
    }

    public void setPendingContainers(Integer pendingContainers) {
        PendingContainers = pendingContainers;
    }

    public Integer getReservedMB() {
        return ReservedMB;
    }

    public void setReservedMB(Integer reservedMB) {
        ReservedMB = reservedMB;
    }

    public Integer getReservedVCores() {
        return ReservedVCores;
    }

    public void setReservedVCores(Integer reservedVCores) {
        ReservedVCores = reservedVCores;
    }

    public Integer getReservedContainers() {
        return ReservedContainers;
    }

    public void setReservedContainers(Integer reservedContainers) {
        ReservedContainers = reservedContainers;
    }

    public Integer getActiveApplications() {
        return ActiveApplications;
    }

    public void setActiveApplications(Integer activeApplications) {
        ActiveApplications = activeApplications;
    }
}
