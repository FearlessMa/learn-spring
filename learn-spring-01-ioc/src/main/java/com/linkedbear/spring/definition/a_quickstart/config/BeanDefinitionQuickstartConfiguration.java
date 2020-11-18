package com.linkedbear.spring.definition.a_quickstart.config;

import com.linkedbear.spring.definition.a_quickstart.bean.Person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanDefinitionQuickstartConfiguration {
  @Bean
  @Primary
  public Person person(){
    return new Person();
  }
}
