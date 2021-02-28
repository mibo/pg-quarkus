package com.github.mibo.pg.quarkus.control;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

  public String greet() {
    return "Hello";
  }

  public String greet(String name) {
    return String.format("Hello %s", name);
  }
}
