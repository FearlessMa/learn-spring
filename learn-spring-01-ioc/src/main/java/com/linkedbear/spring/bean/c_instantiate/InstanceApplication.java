package com.linkedbear.spring.bean.c_instantiate;

import com.linkedbear.spring.bean.c_instantiate.bean.Ball;
import com.linkedbear.spring.bean.c_instantiate.config.AnnoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InstanceApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
    Ball ball = ctx.getBean(Ball.class);
    System.out.println(ball);
  }
}
