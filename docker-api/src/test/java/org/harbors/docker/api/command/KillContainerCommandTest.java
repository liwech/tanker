package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(JUnit4.class)
public class KillContainerCommandTest {

    private static final Logger logger = LoggerFactory.getLogger(KillContainerCommandTest.class);

    @Test
    public void killContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "cc9b22f88abb";
        KillContainerCommand command = new KillContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 204);
    }

    @Test
    public void killNotExistingContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "not-existing-container";
        KillContainerCommand command = new KillContainerCommand(containerId, 9);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 404);
        Assert.assertEquals("No such container: not-existing-container", command.getResponse().trim());
    }

}
