package com.linkedbear.spring.basic_di.d_complexfield.bean;

import org.springframework.stereotype.Component;

@Component("administrator")
public class Person {
  private String name = "person";
  private int age = 18;

  public void setAge(int age) {
    this.age = age;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "name=" + name + ",age=" + age;
  }
}
