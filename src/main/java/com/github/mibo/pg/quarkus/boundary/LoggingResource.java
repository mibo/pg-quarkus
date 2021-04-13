package com.github.mibo.pg.quarkus.boundary;

import com.github.mibo.pg.quarkus.control.GreetingService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;

@Path("/log")
public class LoggingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String get() {
        System.out.println("Got GET request");
        return "Got GET request";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> post(String content) {
        System.out.println("PUT request content: " + content);
        Map<String, String> json = new HashMap<>();
        json.put("request_type", "PUT");
        json.put("content", content);
        return json;
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, String> put(String content) {
        System.out.println("PUT request content: " + content);
        Map<String, String> json = new HashMap<>();
        json.put("request_type", "PUT");
        json.put("content", content);
        return json;
    }
}