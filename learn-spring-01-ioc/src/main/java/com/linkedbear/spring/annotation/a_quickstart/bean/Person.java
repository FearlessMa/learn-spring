package com.linkedbear.spring.annotation.a_quickstart.bean;

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

  @Override
  public String toString() {
    return "name=" + name + " age=" + age;
  }
}