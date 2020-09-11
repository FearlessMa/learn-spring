package com.linkedbear.spring.basic_di.anno_set;

import java.util.stream.Stream;

import com.linkedbear.spring.basic_di.anno_set.config.ConfigAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurableAnnoApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigAnno.class);
    String beanNames[] = ctx.getBeanDefinitionNames();
    Stream.of(beanNames).forEach(System.out::println);
  }
}
