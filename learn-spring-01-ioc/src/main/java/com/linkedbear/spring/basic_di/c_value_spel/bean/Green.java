package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Green {
  // spEl 表达式计算
  @Value("#{'copy'+ blue.name }")
  private String name;
  @Value("#{blue.order +1}")
  private int order;

  @Override
  public String toString() {
    return "name=" + name + ", order=" + order;
  }
}
