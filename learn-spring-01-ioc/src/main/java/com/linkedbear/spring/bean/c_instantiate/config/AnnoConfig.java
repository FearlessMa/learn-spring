package com.linkedbear.spring.bean.c_instantiate.config;

import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import com.linkedbear.spring.bean.c_instantiate.bean.StaticFactory;
import com.linkedbear.spring.bean.c_instantiate.bean.ToFactoryBallBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnoConfig {
  @Bean
  public ToFactoryBallBean toFactoryBallBean() {

    return new ToFactoryBallBean();
  }

  @Bean
  public Car car2() {
      return StaticFactory.getCar();
  }
}
