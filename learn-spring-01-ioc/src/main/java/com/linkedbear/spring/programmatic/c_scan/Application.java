package com.linkedbear.spring.programmatic.c_scan;

import java.beans.Introspector;
import java.util.Set;

import com.linkedbear.spring.programmatic.b_di.bean.Cat;
import com.linkedbear.spring.programmatic.a_quickstart.bean.Person;
import com.linkedbear.spring.programmatic.b_di.bean.Animal;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    BeanDefinition personDefinition = BeanDefinitionBuilder.rootBeanDefinition(Person.class)
        .addPropertyValue("name", "老王").getBeanDefinition();
    ctx.registerBeanDefinition("laowang", personDefinition);
    ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);
    scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> {
      return metadataReader.getClassMetadata().getSuperClassName().equals(Animal.class.getName());
    });
    // int count = scanner.scan("com.linkedbear.spring.programmatic.b_di.bean");
    Set<BeanDefinition> animalDefinitions = scanner
        .findCandidateComponents("com.linkedbear.spring.programmatic.b_di.bean");
    // System.out.println(animalDefinitions);
    animalDefinitions.forEach((beanDefinition) -> {
      System.out.println("————————");
      String beanClassName = beanDefinition.getBeanClassName();
      // System.out.println(beanDefinition);
      beanDefinition.getPropertyValues().add("name", beanClassName).add("person", new RuntimeBeanReference("laowang"));
      ctx.registerBeanDefinition(Introspector.decapitalize(beanClassName.substring(beanClassName.lastIndexOf("."))),
          beanDefinition);
      // System.out.println(beanDefinition.getBeanClassName());
    });
    ctx.refresh();
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
  }
}
