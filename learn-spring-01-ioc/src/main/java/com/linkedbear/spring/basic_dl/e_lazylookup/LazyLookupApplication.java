package com.linkedbear.spring.basic_dl.e_lazylookup;

import com.linkedbear.spring.basic_dl.e_lazylookup.bean.Cat;
import com.linkedbear.spring.basic_dl.e_lazylookup.bean.Dog;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyLookupApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart_lazylookup.xml");
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
    // getBeanProvider延迟查找类
    ObjectProvider<Dog> dogProvider = ctx.getBeanProvider(Dog.class);
    System.out.println(dogProvider);
    // getIfAvailable 找不到有效值返回null
    Dog dog = dogProvider.getIfAvailable();
    System.out.println(dog);
    if (dog == null) {
      dog = new Dog();
    }
    System.out.println(dog);
    // 简洁写法 找不到返回默认值 new Dog
    Dog dog1 = dogProvider.getIfAvailable(() -> new Dog());
    System.out.println(dog1);
  }
}
