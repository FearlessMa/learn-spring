package com.linkedbear.spring.lifecycle.b_jsr250.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Pen {
  private int ink;

  // bean init执行注解
  @PostConstruct
  public void addInk() {
    System.out.println("钢笔中已加满墨水。。。");

    ink = 100;
  }

  // bean destroy 执行注解
  @PreDestroy
  public void outwellInk() {
    System.out.println("钢笔中的墨水都放干净了。。。");

    ink = 0;
  }

  @Override
  public String toString() {
    return "Pen{" + "ink=" + ink + '}';
  }
}
