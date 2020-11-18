package com.linkedbear.spring.postprocessor.b_getproperty.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.linkedbear.spring.postprocessor.b_getproperty.bean")
public class ConfigAnno implements InitializingBean {
  public void initMethod() {
    System.out.println("initMethod:ConfigAnno");
  }

  @PostConstruct
  public void postConstruct() {
    System.out.println("postConstruct:ConfigAnno");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    // TODO Auto-generated method stub
    System.out.println("afterPropertiesSet:ConfigAnno");
  }
}
