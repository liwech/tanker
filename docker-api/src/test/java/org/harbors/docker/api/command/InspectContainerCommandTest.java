package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.domain.container.InspectContainer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class InspectContainerCommandTest {

    @Test
    public void inspectTest() {
        DockerClient client = new DockerClient("http://overflowx.io:4243");
        String containerId = "cc9b22f88abb";
        InspectContainerCommand command = new InspectContainerCommand(containerId);
        InspectContainer inspectContainer = client.execute(command).getResponse();
        Assert.assertNotNull(inspectContainer);
    }

}
