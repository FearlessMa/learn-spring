package com.linkedbear.spring.configuration.a_module.config;

import com.linkedbear.spring.configuration.a_module.bean.Bartender;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BartenderConfiguration {
  @Bean
  public Bartender zhangsan() {
    return new Bartender("zhangsan");
  }

  @Bean
  public Bartender lisi() {
    return new Bartender("lisi");
  }
}
