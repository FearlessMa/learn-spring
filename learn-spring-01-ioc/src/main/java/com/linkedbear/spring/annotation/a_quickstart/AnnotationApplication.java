package com.linkedbear.spring.annotation.a_quickstart;

import com.linkedbear.spring.annotation.a_quickstart.bean.Person;
import com.linkedbear.spring.annotation.a_quickstart.config.QuickstartConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationApplication {
  public static void main(String[] args) {
    // 获取注解驱动
    ApplicationContext ctx = new AnnotationConfigApplicationContext(QuickstartConfiguration.class);
    Person person = ctx.getBean(Person.class);
    System.out.println(person);
  }
}
