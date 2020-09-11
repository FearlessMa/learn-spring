package com.linkedbear.spring.basic_di.d_complexfield.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
  @Value("dog")
  private String name;
  // 在 Bean 中直接在 属性 / setter 方法 上标注 @Autowired 注解，
  // IOC 容器会按照属性对应的类型，从容器中找对应类型的 Bean 赋值到对应的属性上，实现自动注入。
  // required
  @Autowired(required = false)
  // @Qualifier("administrator") //指定注入Bean的名称
  private Person person;

  @Override
  public String toString() {
    return "name=" + name + ", person:" + (person != null ? person.toString() : null);
  }
}
