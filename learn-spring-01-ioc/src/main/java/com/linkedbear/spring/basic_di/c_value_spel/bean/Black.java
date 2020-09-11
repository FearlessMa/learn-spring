package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Black {
  //  Value 注解 初始化
  @Value("black")
  private String name;
  @Value("0")
  private int order;

  @Override
  public String toString() {
    return "name=" + name + ",order=" + order;
  }
}
