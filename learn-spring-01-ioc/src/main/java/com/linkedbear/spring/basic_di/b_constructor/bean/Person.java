package com.linkedbear.spring.basic_di.b_constructor.bean;

public class Person {
  private String name;
  private int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "name=" + name + " age=" + age;
  }
}
