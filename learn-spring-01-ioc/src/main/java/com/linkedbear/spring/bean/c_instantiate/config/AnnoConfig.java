package com.linkedbear.spring.bean.c_instantiate.config;

import com.linkedbear.spring.bean.c_instantiate.bean.ToFactoryBallBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoConfig {
  @Bean
  public ToFactoryBallBean toFactoryBallBean() {

    return new ToFactoryBallBean();
  }
}
