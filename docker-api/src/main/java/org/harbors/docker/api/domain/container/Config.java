package org.harbors.docker.api.domain.container;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Map;

public class Config {

    @JsonProperty("Hostname")
    private String hostname;

    @JsonProperty("Domainname")
    private String domainname;

    @JsonProperty("User")
    private String user;

    @JsonProperty("Memory")
    private String memory;

    @JsonProperty("MemorySwap")
    private String memorySwap;

    @JsonProperty("CpuShares")
    private String cpuShares;

    @JsonProperty("AttachStdin")
    private String attachStdin;

    @JsonProperty("AttachStdout")
    private String attachStdout;

    @JsonProperty("AttachStderr")
    private String attachStderr;

    @JsonProperty("PortSpecs")
    private String[] portSpecs;

    @JsonProperty("ExposedPorts")
    private Map exposedPorts;

    @JsonProperty("Tty")
    private String tty;

    @JsonProperty("OpenStdin")
    private String openStdin;

    @JsonProperty("StdinOnce")
    private String stdinOnce;

    @JsonProperty("Env")
    private String[] env;

    @JsonProperty("Cmd")
    private String[] Cmd;

    @JsonProperty("Dns")
    private String[] dns;

    @JsonProperty("Image")
    private String image;

    @JsonProperty("Volumes")
    private Map volumes;

    @JsonProperty("VolumesFrom")
    private String volumesFrom;

    @JsonProperty("WorkingDir")
    private String args;

    @JsonProperty("Entrypoint")
    private String[] Entrypoint;

    @JsonProperty("NetworkDisabled")
    private String networkDisabled;

    @JsonProperty("Privileged")
    private String privileged;

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMemorySwap() {
        return memorySwap;
    }

    public void setMemorySwap(String memorySwap) {
        this.memorySwap = memorySwap;
    }

    public String getCpuShares() {
        return cpuShares;
    }

    public void setCpuShares(String cpuShares) {
        this.cpuShares = cpuShares;
    }

    public String getAttachStdin() {
        return attachStdin;
    }

    public void setAttachStdin(String attachStdin) {
        this.attachStdin = attachStdin;
    }

    public String getAttachStdout() {
        return attachStdout;
    }

    public void setAttachStdout(String attachStdout) {
        this.attachStdout = attachStdout;
    }

    public String getAttachStderr() {
        return attachStderr;
    }

    public void setAttachStderr(String attachStderr) {
        this.attachStderr = attachStderr;
    }

    public String[] getPortSpecs() {
        return portSpecs;
    }

    public void setPortSpecs(String[] portSpecs) {
        this.portSpecs = portSpecs;
    }

    public Map getExposedPorts() {
        return exposedPorts;
    }

    public void setExposedPorts(Map exposedPorts) {
        this.exposedPorts = exposedPorts;
    }

    public String getTty() {
        return tty;
    }

    public void setTty(String tty) {
        this.tty = tty;
    }

    public String getOpenStdin() {
        return openStdin;
    }

    public void setOpenStdin(String openStdin) {
        this.openStdin = openStdin;
    }

    public String getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(String stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public String[] getEnv() {
        return env;
    }

    public void setEnv(String[] env) {
        this.env = env;
    }

    public String[] getCmd() {
        return Cmd;
    }

    public void setCmd(String[] cmd) {
        Cmd = cmd;
    }

    public String[] getDns() {
        return dns;
    }

    public void setDns(String[] dns) {
        this.dns = dns;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Map getVolumes() {
        return volumes;
    }

    public void setVolumes(Map volumes) {
        this.volumes = volumes;
    }

    public String getVolumesFrom() {
        return volumesFrom;
    }

    public void setVolumesFrom(String volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    public String[] getEntrypoint() {
        return Entrypoint;
    }

    public void setEntrypoint(String[] entrypoint) {
        Entrypoint = entrypoint;
    }

    public String getNetworkDisabled() {
        return networkDisabled;
    }

    public void setNetworkDisabled(String networkDisabled) {
        this.networkDisabled = networkDisabled;
    }

    public String getPrivileged() {
        return privileged;
    }

    public void setPrivileged(String privileged) {
        this.privileged = privileged;
    }

}
