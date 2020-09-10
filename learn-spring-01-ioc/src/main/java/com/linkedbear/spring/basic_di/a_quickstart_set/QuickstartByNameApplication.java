package com.linkedbear.spring.basic_di.a_quickstart_set;

import com.linkedbear.spring.basic_di.a_quickstart_set.bean.Cat;
import com.linkedbear.spring.basic_di.a_quickstart_set.bean.Person;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {
  public static void main(String[] args) {
    BeanFactory factory = new ClassPathXmlApplicationContext("basic_di/inject_set.xml");
    Person person = factory.getBean(Person.class);
    System.out.println(person);

    Cat cat = factory.getBean(Cat.class);
    System.out.println(cat);

  }
}
