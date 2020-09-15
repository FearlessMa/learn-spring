package com.linkedbear.spring.basic_di.g_complexfield;

import com.linkedbear.spring.basic_di.g_complexfield.annoCofig.AnnoConfig;
import com.linkedbear.spring.basic_di.g_complexfield.bean.Person2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CApplication {
  public static void main(String[] args) {
    ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AnnoConfig.class);

    Person2 person2 = ctx2.getBean(Person2.class);
    System.out.println(person2);
  }
}
