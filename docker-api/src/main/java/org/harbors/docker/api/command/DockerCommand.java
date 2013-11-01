package org.harbors.docker.api.command;

public interface DockerCommand {

    String getEndPoint();

    Class getClazz();

    String getMethod();

    String getAcceptContentType();

    int getResponseCode();

    void setResponseCode(int code);

}
