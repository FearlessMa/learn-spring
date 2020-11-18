package com.linkedbear.spring.definition.c_removedefinition.bean;

public class Person {
  private String name;
  private String sex;

  public void setName(String name) {
    this.name = name;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getName() {
    return name;
  }

  public String getSex() {
    return sex;
  }

  @Override
  public String toString() {
    return "Person {name=" + this.name + ",sex=" + this.sex + "}";
  }
}
