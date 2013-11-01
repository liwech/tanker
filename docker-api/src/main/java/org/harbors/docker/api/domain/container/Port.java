package org.harbors.docker.api.domain.container;


import org.codehaus.jackson.annotate.JsonProperty;

public class Port {

    @JsonProperty("PrivatePort")
    private String privatePort;

    @JsonProperty("PublicPort")
    private String publicPort;

    @JsonProperty("Type")
    private String type;

    public String getPrivatePort() {
        return privatePort;
    }

    public void setPrivatePort(String privatePort) {
        this.privatePort = privatePort;
    }

    public String getPublicPort() {
        return publicPort;
    }

    public void setPublicPort(String publicPort) {
        this.publicPort = publicPort;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
