package com.linkedbear.spring.definition.c_removedefinition;

import com.linkedbear.spring.definition.c_removedefinition.bean.Person;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("definition/c_removedefinition.xml");
    BeanFactory beanFactory = ctx.getBeanFactory();
    System.out.println( Person.class.getSimpleName());
    for(String bdname : ctx.getBeanDefinitionNames()){
      System.out.println(bdname);
    }
    // System.out.println(beanFactory.getType(Person.class.getSimpleName()));
  }
}
