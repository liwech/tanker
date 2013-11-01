package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.domain.container.StartContainer;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StartContainerCommandTest {

    @Test
    @Ignore
    public void start() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "c2dc0c0ece9047dfd26a92a7769590cfb2da495746c04968f629a3dd2d27b44b";
        StartContainer startContainer = new StartContainer();
        startContainer.setContainerId(containerId);
        StartContainerCommand command = new StartContainerCommand(startContainer);
        client.execute(command);
    }

}
