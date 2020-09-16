package com.linkedbear.spring.bean.b_scope.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Toy {
  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public Toy() {
    System.out.println("Toy constructor run ...");
  }

}
