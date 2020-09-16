package com.linkedbear.spring.bean.a_type;

import java.util.Map;

import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.bean.ToyFactoryBean;
import com.linkedbear.spring.bean.a_type.config.AnnoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApplication {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
    Toy toy = ctx.getBean(Toy.class);
    Toy toy1 = ctx.getBean(Toy.class);
    System.out.println(toy == toy1);
    System.out.println(ctx.getBean("&toyFactoryBean"));

    // System.out.println(toy);
    // Map<String, Toy> toys = ctx.getBeansOfType(Toy.class);
    // toys.forEach((name, toy) -> {
    //   System.out.println("name=" + name + ",toy=" + toy);
    // });
  }
}
