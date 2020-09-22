package com.linkedbear.spring.lifecycle.c_initializingbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InitApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.linkedbear.spring.lifecycle.c_initializingbean.bean");
    ctx.close();
  }
}
