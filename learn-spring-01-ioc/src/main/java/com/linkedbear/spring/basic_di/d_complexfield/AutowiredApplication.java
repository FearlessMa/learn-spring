package com.linkedbear.spring.basic_di.d_complexfield;

import com.linkedbear.spring.basic_di.d_complexfield.bean.Dog;
import com.linkedbear.spring.basic_di.d_complexfield.config.ScanConfigAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowiredApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ScanConfigAnno.class);
    Dog dog = ctx.getBean(Dog.class);
    System.out.println(dog);
  }
}
