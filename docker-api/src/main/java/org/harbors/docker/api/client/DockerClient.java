package org.harbors.docker.api.client;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.json.JSONConfiguration;
import org.harbors.docker.api.command.AbstractCommand;

import javax.ws.rs.core.MediaType;
import java.util.logging.Logger;

public class DockerClient {

    private static final Logger logger = Logger.getLogger(DockerClient.class.getName());

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
        client.addFilter(new LoggingFilter(logger));
    }

    protected void configure(Client client, ClientConfig clientConfig) {

    }

    public <T extends AbstractCommand> T execute(T command) {

        WebResource webResource = client.resource(serverUrl + command.getEndPoint());

        ClientResponse response = webResource
                .accept(command.getAcceptContentType())
                .type(MediaType.APPLICATION_JSON_TYPE)
                .method(command.getMethod(), ClientResponse.class, command.getResponse());

        command.setResponseCode(response.getStatus());

        if (response.hasEntity()) {
            command.setResponse(response.getEntity(command.getClazz()));
        }

        return command;
    }

}
