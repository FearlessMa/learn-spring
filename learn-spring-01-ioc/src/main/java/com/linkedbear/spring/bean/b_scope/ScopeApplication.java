package com.linkedbear.spring.bean.b_scope;

import java.util.Map;

import com.linkedbear.spring.bean.b_scope.bean.Child;
import com.linkedbear.spring.bean.b_scope.config.AnnoConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeApplication {
  public static void main(String[] args) {
    ApplicationContext ctx  = new AnnotationConfigApplicationContext("com.linkedbear.spring.bean.b_scope.bean");
    // ApplicationContext ctx = new AnnotationConfigApplicationContext(AnnoConfig.class);
    // Map<String, Child> children = ctx.getBeansOfType(Child.class);
    // children.forEach((name, child) -> {
    //   System.out.println("name=" + name + ",child = " + child);
    // });
  }
}
