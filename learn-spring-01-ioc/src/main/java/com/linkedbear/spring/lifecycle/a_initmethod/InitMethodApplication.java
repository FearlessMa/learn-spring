package com.linkedbear.spring.lifecycle.a_initmethod;

import com.linkedbear.spring.lifecycle.a_initmethod.bean.Cat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitMethodApplication {
  public static void main(String[] args) {
    System.out.println("准备初始化IOC容器。。。");

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/a_initmethod.xml");
    System.out.println("IOC容器初始化完成。。。");

    System.out.println();

    System.out.println("准备销毁IOC容器。。。");
    ctx.close();
    System.out.println("IOC容器销毁完成。。。");
  }
}
