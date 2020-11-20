package com.linkedbear.spring.postprocessor.i_registryprocessor.bean;

import org.springframework.stereotype.Component;

// @Component
public class Dog extends Animal {

  @Override
  public String toString() {
    return "Dog{" + "name='" + name + '\'' + '}';
  }
}