package io.github.ztkmkoo.dss.server.rest;

import io.github.ztkmkoo.dss.core.actor.exception.ExceptionHandler;

public class JsonMappingExceptionHandler implements ExceptionHandler {

    @Override
    public void handleException(Exception e) {
        System.out.println("test");
    }
}