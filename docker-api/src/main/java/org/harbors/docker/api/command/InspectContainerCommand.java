package org.harbors.docker.api.command;

import org.harbors.docker.api.domain.container.InspectContainer;

public class InspectContainerCommand extends AbstractCommand<InspectContainer> {

    private String containerId;

    public InspectContainerCommand(String containerId) {
        this.containerId = containerId;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "/json";
    }

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getAcceptContentType() {
        return "application/json";
    }

}
