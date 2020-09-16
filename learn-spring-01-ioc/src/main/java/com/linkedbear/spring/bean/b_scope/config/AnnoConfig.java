package com.linkedbear.spring.bean.b_scope.config;

import com.linkedbear.spring.bean.b_scope.bean.Child;
import com.linkedbear.spring.bean.b_scope.bean.Toy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.linkedbear.spring.bean.b_scope")
public class AnnoConfig {
  @Bean
  public Child child1(Toy t) {
    Child cd1 = new Child();
    cd1.setToy(t);
    return cd1;
  }

  @Bean
  public Child child2(Toy t) {
    Child cd2 = new Child();
    cd2.setToy(t);
    return cd2;
  }
}
