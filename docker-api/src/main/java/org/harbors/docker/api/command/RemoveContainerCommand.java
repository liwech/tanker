package org.harbors.docker.api.command;

public class RemoveContainerCommand extends AbstractCommand<String> {

    private String containerId;
    private boolean removeVolume = false;


    public RemoveContainerCommand(String containerId) {
        this.containerId = containerId;
    }

    public RemoveContainerCommand(String containerId, boolean removeVolume) {
        this(containerId);
        this.removeVolume = removeVolume;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "?v=" + removeVolume;
    }

    @Override
    public String getMethod() {
        return "DELETE";
    }

    public String getAcceptContentType() {
        return "text/plain";
    }

}
