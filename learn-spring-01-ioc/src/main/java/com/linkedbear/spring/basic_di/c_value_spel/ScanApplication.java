package com.linkedbear.spring.basic_di.c_value_spel;

import java.util.stream.Stream;

import com.linkedbear.spring.basic_di.c_value_spel.bean.Black;
import com.linkedbear.spring.basic_di.c_value_spel.bean.Blue;
import com.linkedbear.spring.basic_di.c_value_spel.bean.Green;
import com.linkedbear.spring.basic_di.c_value_spel.bean.Red;
import com.linkedbear.spring.basic_di.c_value_spel.bean.White;
import com.linkedbear.spring.basic_di.c_value_spel.config.ScanComponent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(ScanComponent.class);
    String beanNames[] = ctx.getBeanDefinitionNames();
    Stream.of(beanNames).forEach(System.out::println);
    Black black = ctx.getBean(Black.class);
    System.out.println(black.toString());

    Red red = ctx.getBean(Red.class);
    System.out.println("red: " + red);

    Blue blue = ctx.getBean(Blue.class);
    System.out.println("blue: " + blue);

    Green green = ctx.getBean(Green.class);
    System.out.println("green: " + green);

    White white = ctx.getBean(White.class);
    System.out.println("white: " + white);
  }
}
