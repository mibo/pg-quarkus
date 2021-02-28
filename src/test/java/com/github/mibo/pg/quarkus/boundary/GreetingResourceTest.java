package com.github.mibo.pg.quarkus.boundary;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello/resteasy")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

    @Test
    public void testGreetWithNameEndpoint() {
        given()
          .when().get("/hello/greet/test-name")
          .then()
             .statusCode(200)
             .body(is("Hello test-name"));
    }

    @Test
    public void testNotFoundEndpoint() {
        given()
          .when().get("/hello/not-found")
          .then()
             .statusCode(404);
    }
}