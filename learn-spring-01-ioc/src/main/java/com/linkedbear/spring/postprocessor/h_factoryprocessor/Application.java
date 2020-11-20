package com.linkedbear.spring.postprocessor.h_factoryprocessor;

import com.linkedbear.spring.postprocessor.h_factoryprocessor.bean.Color;
import com.linkedbear.spring.postprocessor.h_factoryprocessor.bean.Green;
import com.linkedbear.spring.postprocessor.h_factoryprocessor.bean.Red;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.postprocessor.h_factoryprocessor");
    Red red = ctx.getBean(Red.class);
    System.out.println(red);
    Green green = ctx.getBean(Green.class);
    System.out.println(green);
  }
}
