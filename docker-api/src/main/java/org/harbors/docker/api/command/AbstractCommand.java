package org.harbors.docker.api.command;

import java.lang.reflect.ParameterizedType;

public abstract class AbstractCommand<T> implements DockerCommand {

    protected T response;
    protected int responseCode;


    public T getResponse() {
        return response;
    }

    public void setResponse(T r) {
        this.response = r;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    @Override
    public Class getClazz() {
        return (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

}
