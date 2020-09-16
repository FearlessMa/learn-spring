package com.linkedbear.spring.bean.b_scope.bean;

public class Child {
  private Toy toy;

  public void setToy(Toy object) {
    this.toy = object;
  }

  @Override
  public String toString() {
    return "child" + toy.toString();
  }
}
