package org.harbors.docker.api.domain.container;

import org.codehaus.jackson.annotate.JsonProperty;

public class StartContainer {

    @JsonProperty("Binds")
    private String[] binds;

    public String[] getBinds() {
        return binds;
    }

    public void setBinds(String[] binds) {
        this.binds = binds;
    }

}
