package com.github.mibo.pg.quarkus.boundary;

import com.github.mibo.pg.quarkus.control.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greeting;

    @GET
    @Path("/resteasy")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("/greet")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet() {
        return greeting.greet();
    }

    @GET
    @Path("/greet/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@PathParam("name") String name) {
        return greeting.greet(name);
    }
}