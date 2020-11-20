package com.linkedbear.spring.programmatic.b_di;

import com.linkedbear.spring.programmatic.b_di.bean.Cat;
import com.linkedbear.spring.programmatic.a_quickstart.bean.Person;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    BeanDefinition catBeanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Cat.class).getBeanDefinition();
    Person person = new Person();
    person.setName("zhangsan");
    catBeanDefinition.getPropertyValues().add("name", "cat").add("person", person);
    ctx.registerBeanDefinition("cat", catBeanDefinition);
    ctx.refresh();
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
    
  }
}
