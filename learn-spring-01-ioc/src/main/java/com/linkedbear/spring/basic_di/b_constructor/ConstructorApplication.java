package com.linkedbear.spring.basic_di.b_constructor;

import com.linkedbear.spring.basic_di.b_constructor.bean.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_di/inject_constructor.xml");
    Person person = ctx.getBean(Person.class);
    System.out.println(person);
  }
}
