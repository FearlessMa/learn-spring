package com.linkedbear.spring.annotation.b_scan;

import java.util.stream.Stream;

import com.linkedbear.spring.annotation.b_scan.config.ComponentScanConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ComponentScanConfiguration.class);
    String beanNames[] = ctx.getBeanDefinitionNames();
    System.out.println(beanNames);
    Stream.of(beanNames).forEach(System.out::println);
  }
}
