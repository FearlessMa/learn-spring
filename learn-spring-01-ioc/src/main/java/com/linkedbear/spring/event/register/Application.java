package com.linkedbear.spring.event.register;

import com.linkedbear.spring.event.register.bean.RegisterService;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.event.register.bean");
    RegisterService service = ctx.getBean(RegisterService.class);
    service.register("test");

  }
}
