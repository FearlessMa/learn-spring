package com.linkedbear.spring.event.a_quickstart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.event.a_quickstart.listener");
    System.out.println("IOC容器初始化完成。。。");
    ctx.close();
    System.out.println("IOC容器关闭。。。");

  }
}
