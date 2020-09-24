package com.linkedbear.spring.configuration.a_module;

import java.util.Map;
import java.util.stream.Stream;

import com.linkedbear.spring.configuration.a_module.bean.Bartender;
import com.linkedbear.spring.configuration.a_module.bean.Boss;
import com.linkedbear.spring.configuration.a_module.config.TavernConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TavernApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
    String beanNames[] = ctx.getBeanDefinitionNames();
    Stream.of(beanNames).forEach(beanName -> {
      System.out.println(beanName);
    });
    Boss boss = ctx.getBean(Boss.class);
    System.out.println(boss);

    System.out.println("----------");

    Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
    bartenders.forEach((beanName, bartender) -> {
      System.out.println(beanName);
      System.out.println(bartender);
    });
  }
}
