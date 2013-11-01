package org.harbors.docker.api.command;

public class RestartContainerCommand extends AbstractCommand<String> {

    private String containerId;
    private Integer timer;


    public RestartContainerCommand(String containerId) {
        this.containerId = containerId;
    }

    public RestartContainerCommand(String containerId, int timer) {
        this(containerId);
        this.timer = timer;
    }

    @Override
    public String getEndPoint() {
        return "/containers/" + containerId + "/restart" + ((timer == null ? "" : "?t=" + timer));
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    public String getAcceptContentType() {
        return "text/plain";
    }

}
