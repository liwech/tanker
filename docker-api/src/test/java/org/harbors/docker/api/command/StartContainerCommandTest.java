package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.domain.container.StartContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class StartContainerCommandTest {

    @Test
    public void start() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "cc9b22f88abb";
        StartContainer startContainer = new StartContainer();
        startContainer.setBinds(new String[]{"/tmp:/tmp"});
        StartContainerCommand command = new StartContainerCommand(containerId, startContainer);
        client.execute(command);
    }

}
