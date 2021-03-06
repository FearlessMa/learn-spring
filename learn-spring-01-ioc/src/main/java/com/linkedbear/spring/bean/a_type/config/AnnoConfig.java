package com.linkedbear.spring.bean.a_type.config;

import com.linkedbear.spring.bean.a_type.bean.Ball;
import com.linkedbear.spring.bean.a_type.bean.Child;
import com.linkedbear.spring.bean.a_type.bean.Toy;
import com.linkedbear.spring.bean.a_type.bean.ToyFactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoConfig {
  @Bean
  public Child child() {
    return new Child();
  }

  // @Bean
  // public Toy ball(){
  //   return new Ball("ball");
  // }

  @Bean
  public ToyFactoryBean toyFactoryBean() {
    ToyFactoryBean toyFactory = new ToyFactoryBean();
    toyFactory.setChild(child());
    return toyFactory;
  }
}
