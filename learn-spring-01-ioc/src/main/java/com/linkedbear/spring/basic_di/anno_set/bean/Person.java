package com.linkedbear.spring.basic_di.anno_set.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
  private String name;
  private int age;
  public int getAge() {
    return age;
  }
  public String getName() {
    return name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setName(String name) {
    this.name = name;
  }
}
