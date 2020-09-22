package com.linkedbear.spring.lifecycle.a_initmethod.config;

import com.linkedbear.spring.lifecycle.a_initmethod.bean.Dog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InitMethodConfigAnno {
  @Bean
  public Dog getDog() {
    Dog dog = new Dog("dog");
    return dog;
  }
}
