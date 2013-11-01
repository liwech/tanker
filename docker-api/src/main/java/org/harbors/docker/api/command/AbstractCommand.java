package org.harbors.docker.api.command;

import java.lang.reflect.ParameterizedType;

public abstract class AbstractCommand<T> implements DockerCommand {

    protected T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T r) {
        this.response = r;
    }

    @Override
    public Class getClazz() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
