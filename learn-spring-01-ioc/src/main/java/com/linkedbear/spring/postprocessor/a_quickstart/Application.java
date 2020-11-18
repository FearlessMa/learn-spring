package com.linkedbear.spring.postprocessor.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.postprocessor.a_quickstart.bean");
    // ctx.close();
    for(String bdname : ctx.getBeanDefinitionNames()){
      System.out.println(bdname);
    }
  }
}
