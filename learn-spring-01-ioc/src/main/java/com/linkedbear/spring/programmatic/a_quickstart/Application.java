package com.linkedbear.spring.programmatic.a_quickstart;

import com.linkedbear.spring.programmatic.a_quickstart.bean.Person;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class).getBeanDefinition();
    beanDefinition.getPropertyValues().add("name", "zhangsan");
    ctx.registerBeanDefinition("person", beanDefinition);
    ctx.refresh();
    Person person = ctx.getBean(Person.class);
    System.out.println(person);
  }
}
