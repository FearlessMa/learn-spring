package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Red {
  // .properties 文件配置属性
  @Value("${red.name}")
  private String name;
  @Value("${red.order}")
  private int order;

  @Override
  public String toString() {
    return "name=" + name + ", order=" + order;
  }
}
