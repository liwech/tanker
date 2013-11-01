package org.harbors.docker.api.command;

public class KillContainerCommand extends AbstractCommand<String> {

    private String containerId;
    private Integer signal;

    public KillContainerCommand(String containerId) {
        this.containerId = containerId;
    }

    public KillContainerCommand(String containerId, int signal) {
        this(containerId);
        this.signal = signal;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "/kill" + ((signal == null ? "" : "?signal=" + signal));
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    public String getAcceptContentType() {
        return "text/plain";
    }

}
