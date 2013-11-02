package io.tanker.service;

import com.google.common.collect.Lists;
import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.command.InspectContainerCommand;
import org.harbors.docker.api.command.KillContainerCommand;
import org.harbors.docker.api.command.ListContainersCommand;
import org.harbors.docker.api.command.RemoveContainerCommand;
import org.harbors.docker.api.command.RestartContainerCommand;
import org.harbors.docker.api.command.StartContainerCommand;
import org.harbors.docker.api.command.StopContainerCommand;
import org.harbors.docker.api.domain.container.InspectContainer;
import org.harbors.docker.api.domain.container.ListContainer;
import org.harbors.docker.api.domain.container.StartContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ContainerService {

    private static final Logger logger = LoggerFactory.getLogger(ContainerService.class);

    public List<ListContainer> getAllContainer(long userId) {
        return getAllContainer(userId, false);
    }

    public List<ListContainer> getAllContainer(long userId, boolean includeOffline) {
        logger.info("Listing containers for userId : {} including offline ones : {}", userId, includeOffline);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        ListContainersCommand listContainersCommand = new ListContainersCommand(includeOffline);
        ListContainer[] listContainers = client.execute(listContainersCommand).getResponse();
        return Arrays.asList(listContainers);
    }

    public List<InspectContainer> inspect(long userId, String[] containerIds) {
        logger.info("Inspecting containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        List<InspectContainer> inspectContainers = Lists.newArrayListWithCapacity(containerIds.length);
        for (String containerId : containerIds) {
            InspectContainerCommand inspectContainerCommand = new InspectContainerCommand(containerId);
            InspectContainer inspectContainer = client.execute(inspectContainerCommand).getResponse();
            inspectContainers.add(inspectContainer);
        }
        return inspectContainers;
    }

    public void start(long userId, String[] containerIds) {
        logger.info("Starting containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        for (String containerId : containerIds) {
            client.execute(new StartContainerCommand(containerId, new StartContainer()));
        }
    }

    public void stop(long userId, String[] containerIds) {
        logger.info("Stopping containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        for (String containerId : containerIds) {
            client.execute(new StopContainerCommand(containerId));
        }
    }

    public void restart(long userId, String[] containerIds) {
        logger.info("Restarting containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        for (String containerId : containerIds) {
            client.execute(new RestartContainerCommand(containerId));
        }
    }

    public void remove(long userId, String[] containerIds) {
        logger.info("Removing containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        for (String containerId : containerIds) {
            client.execute(new RemoveContainerCommand(containerId));
        }
    }

    public void kill(long userId, String[] containerIds) {
        logger.info("Killing containers for userId : {} including ids : {}", userId, containerIds);
        DockerClient client = new DockerClient("http://overflow.io:4243");
        for (String containerId : containerIds) {
            client.execute(new KillContainerCommand(containerId));
        }
    }

}