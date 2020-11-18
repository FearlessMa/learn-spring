package com.linkedbear.spring.postprocessor.b_getproperty;

import com.linkedbear.spring.postprocessor.b_getproperty.config.ConfigAnno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAnno.class);
    ctx.close();
  }
}
