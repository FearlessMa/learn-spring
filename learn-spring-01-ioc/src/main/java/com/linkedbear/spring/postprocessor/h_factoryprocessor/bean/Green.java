package com.linkedbear.spring.postprocessor.h_factoryprocessor.bean;

import org.springframework.stereotype.Component;

@Component
public class Green extends Color {
  private String tag;

  public void setTag(String tag) {
    this.tag = tag;
  }

  public String getTag() {
    return tag;
  }

  @Override
  public String toString() {
    return "Green{" + "name='" + name + '\'' + "}";
  }
}
