package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(JUnit4.class)
public class RemoveContainerCommandTest {

    private static final Logger logger = LoggerFactory.getLogger(RemoveContainerCommandTest.class);

    @Test
    public void removeContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "5b22f9adf46f";
        RemoveContainerCommand command = new RemoveContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 204);
    }

    @Test
    public void removeNotExistingContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "not-existing-container";
        RemoveContainerCommand command = new RemoveContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 404);
        Assert.assertEquals("No such container: not-existing-container", command.getResponse().trim());
    }

}
