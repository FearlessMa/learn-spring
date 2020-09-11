package com.linkedbear.spring.basic_di.d_complexfield.config;

import com.linkedbear.spring.basic_di.d_complexfield.bean.Person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

@Configurable
@ComponentScan("com.linkedbear.spring.basic_di.d_complexfield.bean")
public class ScanConfigAnno {
  @Bean // bean 注册 Person 类型 Master
  @Primary // 默认bean
  public Person Master() {
    Person master = new Person();
    master.setName("master");
    return master;
  }
}
