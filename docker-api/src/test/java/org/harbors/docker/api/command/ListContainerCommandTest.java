package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.domain.container.ListContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(JUnit4.class)
public class ListContainerCommandTest {

    private static final Logger logger = LoggerFactory.getLogger(StopContainerCommandTest.class);

    @Test
    public void listContainerTest() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        ListContainersCommand command = new ListContainersCommand(true);
        ListContainer[] listContainerList = client.execute(command).getResponse();

        for (ListContainer listContainer : listContainerList) {
            logger.info(listContainer.getId() + " " + listContainer.getImage());
        }
    }

}
