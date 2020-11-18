package com.linkedbear.spring.postprocessor.b_getproperty.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Dog implements InitializingBean {

  public void initMethod(){
    System.out.println("initMethod");
  }
  @PostConstruct
  public void postConstruct(){
    System.out.println("postConstruct");
  }

  @Override
  public void afterPropertiesSet() throws Exception {
    // TODO Auto-generated method stub
    System.out.println("afterPropertiesSet");
  }
  
}
