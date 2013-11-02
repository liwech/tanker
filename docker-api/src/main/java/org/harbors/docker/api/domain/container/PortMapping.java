package org.harbors.docker.api.domain.container;


import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;

public class PortMapping {

    @JsonProperty("Tcp")
    private Map tcp;

    @JsonProperty("Udp")
    private Map udp;

    public Map getTcp() {
        return tcp;
    }

    public void setTcp(Map tcp) {
        this.tcp = tcp;
    }

    public Map getUdp() {
        return udp;
    }

    public void setUdp(Map udp) {
        this.udp = udp;
    }
}
