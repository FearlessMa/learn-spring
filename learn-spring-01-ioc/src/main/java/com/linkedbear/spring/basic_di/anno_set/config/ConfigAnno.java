package com.linkedbear.spring.basic_di.anno_set.config;

import com.linkedbear.spring.basic_di.anno_set.bean.Person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan("com.linkedbear.spring.basic_di.anno_set.bean")
public class ConfigAnno {
  // @Bean
  // public Person person() {
  //   Person person = new Person();
  //   person.setName("java");
  //   person.setAge(30);
  //   return person;
  // }
}
