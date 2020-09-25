package com.linkedbear.spring.configuration.b_profile.config;

import com.linkedbear.spring.configuration.b_profile.bean.Bar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
  
  @Bean
  public Bar bar1(){
    return new Bar();
  }
}
