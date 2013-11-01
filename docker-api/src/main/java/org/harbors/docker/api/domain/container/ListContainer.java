package org.harbors.docker.api.domain.container;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class ListContainer {

    @JsonProperty("Id")
    private String id;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("Command")
    private String command;

    @JsonProperty("Created")
    private String created;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("SizeRw")
    private String sizeRw;

    @JsonProperty("SizeRootFs")
    private String sizeRootFs;

    @JsonProperty("Ports")
    private List<Port> ports;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSizeRw() {
        return sizeRw;
    }

    public void setSizeRw(String sizeRw) {
        this.sizeRw = sizeRw;
    }

    public String getSizeRootFs() {
        return sizeRootFs;
    }

    public void setSizeRootFs(String sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

}
