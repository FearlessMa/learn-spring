package com.linkedbear.spring.bean.a_type;

import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.bean.ToyFactoryBean;
import com.linkedbear.spring.bean.a_type.config.AnnoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanApplication {
  public static void main(String[] args) throws Exception {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
    Toy toy = ctx.getBean(Toy.class);
    System.out.println(toy);
  }
}
