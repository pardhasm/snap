package com.pardhasm.snap;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.micronaut.runtime.Micronaut;

public class Application {

    public static void main(String[] args) throws JsonProcessingException {
        Micronaut.run(Application.class, args);
    }
}
