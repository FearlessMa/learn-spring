package com.linkedbear.spring.definition.a_quickstart.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
