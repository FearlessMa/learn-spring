package com.linkedbear.spring.bean.c_instantiate.bean;

public class StaticFactory {

  public static Car getCar() {
    return new Car();
  }
}
