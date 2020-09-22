package com.linkedbear.spring.lifecycle.a_initmethod.bean;

public class Dog {
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void init() {
    System.out.println(name + "init...");
  }

  public void destroy() {
    System.out.println(name + "destroy...");
  }
}
