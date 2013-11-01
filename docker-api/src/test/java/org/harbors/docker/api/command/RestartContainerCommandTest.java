package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(JUnit4.class)
public class RestartContainerCommandTest {

    private static final Logger logger = LoggerFactory.getLogger(RestartContainerCommandTest.class);

    @Test
    public void restartContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "cc9b22f88abb";
        RestartContainerCommand command = new RestartContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 204);
    }

    @Test
    public void restartNotExistingContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "not-existing-container";
        RestartContainerCommand command = new RestartContainerCommand(containerId, 10);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 404);
        Assert.assertEquals("No such container: not-existing-container", command.getResponse().trim());
    }

}
