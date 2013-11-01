package org.harbors.docker.api.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import org.harbors.docker.api.command.AbstractCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DockerClient {

    private static final Logger logger = LoggerFactory.getLogger(DockerClient.class);

    private Client client;
    private ClientConfig clientConfig;

    private String serverUrl;

    public DockerClient(String serverUrl) {
        this.serverUrl = serverUrl;
        setDefaultConfiguration();
        configure(client, clientConfig);
    }

    private void setDefaultConfiguration() {
        clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
        client = Client.create(clientConfig);
    }

    protected void configure(Client client, ClientConfig clientConfig) {

    }

    public <T extends AbstractCommand> T execute(T command) {

        WebResource webResource = client.resource(serverUrl + command.getEndPoint());
        webResource.accept(command.getAcceptContentType());

        Object o;
        switch (command.getMethod()) {

            case "GET":
                o = webResource.get(command.getClazz());
                break;

            case "POST":
                o = webResource.post(command.getClazz());
                break;

            default:
                throw new IllegalArgumentException(command.getMethod() + " is not a supported http method.");

        }

        command.setResponse(o);
        return command;

    }

}
