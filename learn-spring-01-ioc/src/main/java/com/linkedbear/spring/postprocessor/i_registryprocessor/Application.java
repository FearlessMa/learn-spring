package com.linkedbear.spring.postprocessor.i_registryprocessor;

import com.linkedbear.spring.postprocessor.i_registryprocessor.bean.Cat;
import com.linkedbear.spring.postprocessor.i_registryprocessor.bean.Dog;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.postprocessor.i_registryprocessor.bean");
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
    Dog dog = ctx.getBean(Dog.class);
    System.out.println(dog);
  }
}
