package com.linkedbear.spring.environment.a_getEnvironment.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("propertysource/jdbc.properties")
public class EnvironmentConfiguration {

  @Autowired
  Environment environment;

  public void printEnvironment() {
    System.out.println(environment);
    System.out.println(environment.getProperty("jdbc.url"));
  }
}
