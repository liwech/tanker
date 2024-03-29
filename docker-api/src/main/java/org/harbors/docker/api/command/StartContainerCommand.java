package org.harbors.docker.api.command;

import org.harbors.docker.api.domain.container.StartContainer;

public class StartContainerCommand extends AbstractCommand<StartContainer> {

    private String containerId;

    public StartContainerCommand(String containerId, StartContainer startContainer) {
        this.containerId = containerId;
        setResponse(startContainer);
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "/start";
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    public String getAcceptContentType() {
        return "text/plain";
    }

}
