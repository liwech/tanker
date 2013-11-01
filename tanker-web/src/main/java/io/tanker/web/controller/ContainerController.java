package io.tanker.web.controller;

import io.tanker.service.ContainerService;
import org.harbors.docker.api.domain.container.ListContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/containers")
public class ContainerController {

    private static final Logger logger = LoggerFactory.getLogger(ContainerController.class);

    @Autowired
    private ContainerService containerService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    public List<ListContainer> index() {

        List<ListContainer> allContainer = containerService.getAllContainer(1100L);

        return allContainer;
    }
}