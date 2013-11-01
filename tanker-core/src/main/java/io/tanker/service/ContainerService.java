package io.tanker.service;

import org.harbors.docker.api.client.DockerClient;
import org.harbors.docker.api.command.ListContainersCommand;
import org.harbors.docker.api.domain.container.ListContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ContainerService {

    private static final Logger logger = LoggerFactory.getLogger(ContainerService.class);

    public List<ListContainer> getAllContainer(Long userId) {

        logger.info("getAllContainer userId:{}", userId);

        DockerClient client = new DockerClient("http://172.17.42.1:4243");

        ListContainersCommand listContainersCommand = new ListContainersCommand();

        ListContainer[] listContainers = client.execute(listContainersCommand).getResponse();

        return Arrays.asList(listContainers);
    }
}