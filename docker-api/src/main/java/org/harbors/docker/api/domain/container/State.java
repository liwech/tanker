package org.harbors.docker.api.domain.container;


import org.codehaus.jackson.annotate.JsonProperty;

public class State {

    @JsonProperty("Running")
    private String running;

    @JsonProperty("Pid")
    private String pid;

    @JsonProperty("ExitCode")
    private String exitCode;

    @JsonProperty("StartedAt")
    private String startedAt;

    @JsonProperty("FinishedAt")
    private String finishedAt;

    @JsonProperty("Ghost")
    private String ghost;

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getExitCode() {
        return exitCode;
    }

    public void setExitCode(String exitCode) {
        this.exitCode = exitCode;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getGhost() {
        return ghost;
    }

    public void setGhost(String ghost) {
        this.ghost = ghost;
    }
}
