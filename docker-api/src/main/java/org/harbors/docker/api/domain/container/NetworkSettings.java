package org.harbors.docker.api.domain.container;

import org.codehaus.jackson.annotate.JsonProperty;

public class NetworkSettings {

    @JsonProperty("IPAddress")
    private String ipAddress;

    @JsonProperty("IPPrefixLen")
    private String ipPrefixLen;

    @JsonProperty("Gateway")
    private String gateway;

    @JsonProperty("Bridge")
    private String bridge;

    @JsonProperty("PortMapping")
    private PortMapping portMapping;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpPrefixLen() {
        return ipPrefixLen;
    }

    public void setIpPrefixLen(String ipPrefixLen) {
        this.ipPrefixLen = ipPrefixLen;
    }

    public String getGateway() {
        return gateway;
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public String getBridge() {
        return bridge;
    }

    public void setBridge(String bridge) {
        this.bridge = bridge;
    }

    public PortMapping getPortMapping() {
        return portMapping;
    }

    public void setPortMapping(PortMapping portMapping) {
        this.portMapping = portMapping;
    }

}
