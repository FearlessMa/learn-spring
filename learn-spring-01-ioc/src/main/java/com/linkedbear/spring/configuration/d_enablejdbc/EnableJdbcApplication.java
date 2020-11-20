package com.linkedbear.spring.configuration.d_enablejdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.linkedbear.spring.configuration.d_enablejdbc.annotation.EnableJdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableJdbc
public class EnableJdbcApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(EnableJdbcApplication.class);
    DruidDataSource dataSource = ctx.getBean(DruidDataSource.class);
    System.out.println(dataSource.getUrl());
    for (String beanName : ctx.getBeanDefinitionNames()) {
      System.out.println(beanName);
    }
  }
}
