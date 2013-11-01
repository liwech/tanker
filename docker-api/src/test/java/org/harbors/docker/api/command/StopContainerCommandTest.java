package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWith(JUnit4.class)
public class StopContainerCommandTest {

    private static final Logger logger = LoggerFactory.getLogger(StopContainerCommandTest.class);


    @Test
    public void stopContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "cc9b22f88abb";
        StopContainerCommand command = new StopContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 204);
    }

    @Test
    public void stopNotExistingContainer() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        String containerId = "not-existing-container";
        StopContainerCommand command = new StopContainerCommand(containerId);
        client.execute(command);
        Assert.assertEquals(command.getResponseCode(), 404);
        logger.info(command.getResponse());
    }

}
