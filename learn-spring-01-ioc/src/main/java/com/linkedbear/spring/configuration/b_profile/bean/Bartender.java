package com.linkedbear.spring.configuration.b_profile.bean;

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
    return "name=" + name;
  }
}
