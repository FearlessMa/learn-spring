package com.linkedbear.spring.definition.b_register;

import com.linkedbear.spring.definition.b_register.bean.Person;
import com.linkedbear.spring.definition.b_register.config.BeanDefinitionRegistryConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanDefinitionRegistryApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
      BeanDefinitionRegistryConfiguration.class);
      Person person = ctx.getBean(Person.class);
      System.out.println(person);
  }
}
