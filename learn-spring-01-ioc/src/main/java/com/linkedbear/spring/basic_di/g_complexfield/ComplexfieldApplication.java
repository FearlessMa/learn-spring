package com.linkedbear.spring.basic_di.g_complexfield;

import com.linkedbear.spring.basic_di.g_complexfield.annoCofig.AnnoConfig;
import com.linkedbear.spring.basic_di.g_complexfield.bean.Person;
import com.linkedbear.spring.basic_di.g_complexfield.bean.Person2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComplexfieldApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/complexfield/inject_complexfield.xml");
    Person person = (Person) ctx.getBean("com.linkedbear.spring.basic_di.g_complexfield.bean.Person");
    System.out.println(person);

    ApplicationContext ctx2 = new AnnotationConfigApplicationContext(AnnoConfig.class);

    Person2 person2 = ctx2.getBean(Person2.class);
    System.out.println(person2);
  }
}
