package com.linkedbear.spring.configuration.c_conditional.bean;

public class Bartender {
  private String name;
  public Bartender(String name) {
    this.name = name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return  name;
  }
}
