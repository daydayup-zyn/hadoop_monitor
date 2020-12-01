package com.hadoop.monitor.entity;

/**
 * @ClassName YarnClusterMetrics
 * @Description TODO
 * @Autor yanni
 * @Date 2020/4/13 9:24
 * @Version 1.0
 **/
public class YarnClusterMetrics {

    private String modelerType;
    private String Hostname;
    private Integer NumActiveNMs;
    private Integer NumUnhealthyNMs;
    private Integer NumLostNMs;
    private Integer NumRebootedNMs;

    public String getModelerType() {
        return modelerType;
    }

    public void setModelerType(String modelerType) {
        this.modelerType = modelerType;
    }

    public String getHostname() {
        return Hostname;
    }

    public void setHostname(String hostname) {
        Hostname = hostname;
    }

    public Integer getNumActiveNMs() {
        return NumActiveNMs;
    }

    public void setNumActiveNMs(Integer numActiveNMs) {
        NumActiveNMs = numActiveNMs;
    }

    public Integer getNumUnhealthyNMs() {
        return NumUnhealthyNMs;
    }

    public void setNumUnhealthyNMs(Integer numUnhealthyNMs) {
        NumUnhealthyNMs = numUnhealthyNMs;
    }

    public Integer getNumLostNMs() {
        return NumLostNMs;
    }

    public void setNumLostNMs(Integer numLostNMs) {
        NumLostNMs = numLostNMs;
    }

    public Integer getNumRebootedNMs() {
        return NumRebootedNMs;
    }

    public void setNumRebootedNMs(Integer numRebootedNMs) {
        NumRebootedNMs = numRebootedNMs;
    }

    @Override
    public String toString() {
        return "YarnClusterMetrics{" +
                "modelerType='" + modelerType + '\'' +
                ", Hostname='" + Hostname + '\'' +
                ", NumActiveNMs=" + NumActiveNMs +
                ", NumUnhealthyNMs=" + NumUnhealthyNMs +
                ", NumLostNMs=" + NumLostNMs +
                ", NumRebootedNMs=" + NumRebootedNMs +
                '}';
    }
}
