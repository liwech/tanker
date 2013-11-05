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
    private long created;

    @JsonProperty("Status")
    private String status;

    @JsonProperty("SizeRw")
    private long sizeRw;

    @JsonProperty("SizeRootFs")
    private long sizeRootFs;

    @JsonProperty("Ports")
    private List<Port> ports;

    @JsonProperty("Names")
    private String[] names;


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

    public long getCreated() {
        return created;
    }

    public void setCreated(long created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getSizeRw() {
        return sizeRw;
    }

    public void setSizeRw(long sizeRw) {
        this.sizeRw = sizeRw;
    }

    public long getSizeRootFs() {
        return sizeRootFs;
    }

    public void setSizeRootFs(long sizeRootFs) {
        this.sizeRootFs = sizeRootFs;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public void setPorts(List<Port> ports) {
        this.ports = ports;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }
}
