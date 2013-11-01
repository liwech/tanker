package org.harbors.docker.api.command;

import org.harbors.docker.api.domain.container.StartContainer;

public class StartContainerCommand extends AbstractCommand<StartContainer> {

    private StartContainer startContainer;

    public StartContainerCommand(StartContainer startContainer) {
        this.startContainer = startContainer;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + startContainer.getContainerId() + "/start";
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    public String getAcceptContentType(){
        return "text/plain";
    }

}
