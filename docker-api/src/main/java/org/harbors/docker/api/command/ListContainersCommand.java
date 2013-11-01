package org.harbors.docker.api.command;

import org.harbors.docker.api.domain.container.ListContainer;

import java.util.List;

public class ListContainersCommand extends AbstractCommand<ListContainer[]> {

    private Boolean listAll;

    public ListContainersCommand() {
        this(false);
    }

    public ListContainersCommand(Boolean listAll) {
        this.listAll = listAll;
    }

    @Override
    public String getEndPoint() {
        return "/containers/json?all=" + listAll;
    }

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getAcceptContentType() {
        return "application/json";
    }

}
