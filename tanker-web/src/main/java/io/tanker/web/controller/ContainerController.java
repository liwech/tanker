package io.tanker.web.controller;

import io.tanker.service.ContainerService;
import org.harbors.docker.api.domain.container.InspectContainer;
import org.harbors.docker.api.domain.container.ListContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.PathVariable;
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

    @ResponseBody
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<ListContainer> list(Boolean includeOffline) {
        return containerService.getAllContainer(1L, includeOffline);
    }

    @ResponseBody
    @RequestMapping(value = "/inspect/{containerIds}", method = RequestMethod.GET)
    public List<InspectContainer> inspect(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        return containerService.inspect(1L, containerIds);
    }


    @ResponseBody
    @RequestMapping(value = "/start/{containerIds}", method = RequestMethod.GET)
    public void start(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        containerService.start(1L, containerIds);
    }

    @ResponseBody
    @RequestMapping(value = "/stop/{containerIds}", method = RequestMethod.GET)
    public void stop(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        containerService.stop(1L, containerIds);
    }

    @ResponseBody
    @RequestMapping(value = "/restart/{containerIds}", method = RequestMethod.GET)
    public void restart(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        containerService.restart(1L, containerIds);
    }

    @ResponseBody
    @RequestMapping(value = "/remove/{containerIds}", method = RequestMethod.GET)
    public void remove(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        containerService.remove(1L, containerIds);
    }

    @ResponseBody
    @RequestMapping(value = "/kill/{containerIds}", method = RequestMethod.GET)
    public void kill(@PathVariable String[] containerIds) {
        Assert.notNull(containerIds);
        containerService.kill(1L, containerIds);
    }

}