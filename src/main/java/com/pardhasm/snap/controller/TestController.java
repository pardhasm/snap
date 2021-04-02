package com.pardhasm.snap.controller;

import com.pardhasm.snap.model.CDC;
import com.pardhasm.snap.service.TestService;
import io.micronaut.core.version.annotation.Version;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import reactor.core.publisher.Mono;

import javax.inject.Inject;

@Controller("/test")
public class TestController {

    @Inject
    TestService testService;

    @Post
    @Version("1")
    @Consumes("application/json")
    @Produces("application/json")
    public Mono<Object> validate(CDC cdc, HttpHeaders httpHeaders){
        return Mono.just(testService.test(cdc));
    }
}
