package com.linkedbear.spring.programmatic.c_scan;

import java.beans.Introspector;
import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.io.ClassPathResource;
import com.linkedbear.spring.programmatic.b_di.bean.Cat;
import com.linkedbear.spring.programmatic.b_di.bean.Animal;

public class ReaderXML {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

    XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(ctx);
    reader.loadBeanDefinitions(new ClassPathResource("programmatic/c.scan.xml"));
    ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(ctx);
    scanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> {
      return metadataReader.getClassMetadata().getSuperClassName().equals(Animal.class.getName());
    });
    Set<BeanDefinition> animalDefinitions = scanner
        .findCandidateComponents("com.linkedbear.spring.programmatic.b_di.bean");
    animalDefinitions.forEach((beanDefinition) -> {
      String beanClassName = beanDefinition.getBeanClassName();
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
