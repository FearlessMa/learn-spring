package com.linkedbear.spring.postprocessor.b_getproperty.bean;

import org.springframework.stereotype.Component;

// @Component
public class Cat {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Cat{" + "name='" + name + '\'' + '}';
  }
}