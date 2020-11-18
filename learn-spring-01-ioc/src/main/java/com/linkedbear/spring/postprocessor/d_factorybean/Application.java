package com.linkedbear.spring.postprocessor.d_factorybean;

import com.linkedbear.spring.postprocessor.d_factorybean.bean.Egg;
import com.linkedbear.spring.postprocessor.d_factorybean.bean.Hen;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) throws BeansException, Exception {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.postprocessor.d_factorybean.bean");
    Egg egg = ctx.getBean(Egg.class);
    // Egg egg = ctx.getBean(Hen.class).getObject();
    System.out.println(egg);
    ctx.close();
  }
}
