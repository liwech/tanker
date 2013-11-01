package org.harbors.docker.api.domain.container;

import org.codehaus.jackson.annotate.JsonProperty;
import org.harbors.docker.api.domain.DockerDomain;

public class InspectContainer implements DockerDomain {

    @JsonProperty("ID")
    private String id;

    @JsonProperty("Created")
    private String created;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("Args")
    private String[] args;

    @JsonProperty("Config")
    private Config config;

    @JsonProperty("State")
    private State state;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("NetworkSettings")
    private NetworkSettings networkSettings;

    @JsonProperty("SysInitPath")
    private String sysInitPath;

    @JsonProperty("ResolvConfPath")
    private String ResolvConfPath;

    @JsonProperty("HostnamePath")
    private String hostnamePath;

    @JsonProperty("HostsPath")
    private String hostsPath;

    @JsonProperty("Volumes")
    private Volume volumes;

    @JsonProperty("VolumesRW")
    private Volume volumesRW;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public Config getConfig() {
        return config;
    }

    public void setConfig(Config config) {
        this.config = config;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public void setNetworkSettings(NetworkSettings networkSettings) {
        this.networkSettings = networkSettings;
    }

    public String getSysInitPath() {
        return sysInitPath;
    }

    public void setSysInitPath(String sysInitPath) {
        this.sysInitPath = sysInitPath;
    }

    public String getResolvConfPath() {
        return ResolvConfPath;
    }

    public void setResolvConfPath(String resolvConfPath) {
        ResolvConfPath = resolvConfPath;
    }

    public String getHostnamePath() {
        return hostnamePath;
    }

    public void setHostnamePath(String hostnamePath) {
        this.hostnamePath = hostnamePath;
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public void setHostsPath(String hostsPath) {
        this.hostsPath = hostsPath;
    }

    public Volume getVolumes() {
        return volumes;
    }

    public void setVolumes(Volume volumes) {
        this.volumes = volumes;
    }

    public Volume getVolumesRW() {
        return volumesRW;
    }

    public void setVolumesRW(Volume volumesRW) {
        this.volumesRW = volumesRW;
    }
}
