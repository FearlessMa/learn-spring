package com.linkedbear.spring.configuration.c_conditional.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfiguration {

  @Bean
  @Profile("dev")
  public DataSource devDataSource() {
    return null;
  }

  @Bean
  @Profile("test")
  public DataSource testDataSource() {
    return null;
  }

  @Bean
  @Profile("pro")
  public DataSource proDataSource() {
    return null;
  }
}
