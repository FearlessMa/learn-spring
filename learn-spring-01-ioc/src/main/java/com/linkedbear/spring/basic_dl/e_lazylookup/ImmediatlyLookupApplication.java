package com.linkedbear.spring.basic_dl.e_lazylookup;

import java.util.stream.Stream;

import com.linkedbear.spring.basic_dl.e_lazylookup.bean.Cat;
import com.linkedbear.spring.basic_dl.e_lazylookup.bean.Dog;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ImmediatlyLookupApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart_lazylookup.xml");
    String beanNames[] = ctx.getBeanDefinitionNames();
    Stream.of(beanNames).forEach(System.out::println);
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
    Dog dog;
    try {
      dog = ctx.getBean(Dog.class);
    } catch (NoSuchBeanDefinitionException e) {
      // 找不到Dog时手动创建
      dog = new Dog();
    }
    System.out.println(dog);
  }
}
