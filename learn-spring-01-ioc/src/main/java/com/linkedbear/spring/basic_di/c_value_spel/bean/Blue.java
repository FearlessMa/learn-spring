package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Blue {
  //  使用 SpEL 表达式 赋值
  @Value("#{'blue'}")
  public String name;
  @Value("#{2}")
  public int order;

  @Override
  public String toString() {
    return "name=" + name + " order=" + order;
  }
}
