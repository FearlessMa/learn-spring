package com.linkedbear.spring.bean.c_instantiate;

import java.util.Map;

import com.linkedbear.spring.bean.c_instantiate.bean.Car;
import com.linkedbear.spring.bean.c_instantiate.bean.StaticFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceXMLApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/bean_instantiate.xml");
    Map<String, Car> cars = ctx.getBeansOfType(Car.class);
    cars.forEach((beanName, car) -> {
      System.out.println("beanName=" + beanName + "car:" + car);
    });
    // System.out.println(ctx.getBean(StaticFactory.class));

  }
}
