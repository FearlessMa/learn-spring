package com.linkedbear.spring.programmatic.a_quickstart.bean;

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
    return "person{name=" + name + "}";
  }
}
