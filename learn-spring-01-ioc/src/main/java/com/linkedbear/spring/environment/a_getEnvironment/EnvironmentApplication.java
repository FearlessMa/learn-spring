package com.linkedbear.spring.environment.a_getEnvironment;

import com.linkedbear.spring.environment.a_getEnvironment.config.EnvironmentConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EnvironmentApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnvironmentConfiguration.class);

    EnvironmentConfiguration config = ctx.getBean(EnvironmentConfiguration.class);
    config.printEnvironment();
  }
}
