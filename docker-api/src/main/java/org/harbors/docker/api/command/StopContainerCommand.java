package org.harbors.docker.api.command;

public class StopContainerCommand extends AbstractCommand<String> {

    private String containerId;

    public StopContainerCommand(String containerId) {
        this.containerId = containerId;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "/stop";
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    public String getAcceptContentType() {
        return "text/plain";
    }

}
