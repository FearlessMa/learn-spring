package com.linkedbear.spring.configuration.b_profile.config;

import com.linkedbear.spring.configuration.b_profile.bean.Bartender;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
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
