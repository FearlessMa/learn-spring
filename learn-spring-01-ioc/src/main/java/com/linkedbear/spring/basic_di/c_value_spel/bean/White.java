package com.linkedbear.spring.basic_di.c_value_spel.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class White {
  @Value("#{ blue.name.substring(0,3) }")
  private String name;
  @Value("#{ T(java.lang.Integer).MAX_VALUE }")
  private int order;

  @Override
  public String toString() {
    return "name=" + name + ", order=" + order;
  }
}
