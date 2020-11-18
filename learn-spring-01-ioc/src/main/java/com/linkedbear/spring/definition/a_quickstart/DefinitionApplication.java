package com.linkedbear.spring.definition.a_quickstart;

import com.linkedbear.spring.definition.a_quickstart.bean.Person;
import com.linkedbear.spring.definition.a_quickstart.config.BeanDefinitionQuickstartConfiguration;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefinitionApplication {
  public static void main(String[] args) {
    // ClassPathXmlApplicationContext ctx = new
    // ClassPathXmlApplicationContext("definition/a_quickstart.xml");
    // Person person = ctx.getBean(Person.class);
    // System.out.println(person);
    // BeanDefinition beanDefinition =
    // ctx.getBeanFactory().getBeanDefinition("person");
    // AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
    //     "com.linkedbear.spring.definition.a_quickstart.bean");
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanDefinitionQuickstartConfiguration.class);
    BeanDefinition beanDefinition = ctx.getBeanDefinition("person");
    System.out.println(beanDefinition);
    System.out.println(beanDefinition.getClass().getName());
  }
}
