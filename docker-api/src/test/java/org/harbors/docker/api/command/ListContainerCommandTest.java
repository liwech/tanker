package org.harbors.docker.api.command;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.domain.container.InspectContainer;
import org.harbors.docker.api.domain.container.ListContainer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class ListContainerCommandTest {

    @Test
    public void listContainerTest() {
        DockerClient client = new DockerClient("http://overflow.io:4243");
        ListContainersCommand command = new ListContainersCommand(true);
        ListContainer[] listContainerList = client.execute(command).getResponse();

        for (ListContainer listContainer : listContainerList) {
            System.out.println(listContainer.getId() + " " + listContainer.getImage());
        }
    }

}
