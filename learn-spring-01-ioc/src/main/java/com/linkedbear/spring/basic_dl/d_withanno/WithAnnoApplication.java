package com.linkedbear.spring.basic_dl.d_withanno;

import java.util.Map;
import java.util.stream.Stream;

import com.linkedbear.spring.basic_dl.d_withanno.anno.Color;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WithAnnoApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart_withanno.xml");
    // 根据注释类型获取所有注释类
    Map<String, Object> beans = ctx.getBeansWithAnnotation(Color.class);
    beans.forEach((beanName, bean) -> {
      System.out.println(beanName + ":" + bean);
    });
    System.out.println("---------");
    String names[] = ctx.getBeanDefinitionNames();
    // 利用jdk8的Stream快速编写打印方法
    Stream.of(names).forEach(System.out::println);
    for (String beanName : names) {
      Object beanObj = ctx.getBean(beanName);
      System.out.println(beanObj);
    }
  }
}
