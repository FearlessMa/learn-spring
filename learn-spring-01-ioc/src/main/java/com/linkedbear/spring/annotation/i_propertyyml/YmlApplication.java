package com.linkedbear.spring.annotation.i_propertyyml;

import com.linkedbear.spring.annotation.i_propertyyml.bean.YmlJdbcProperties;
import com.linkedbear.spring.annotation.i_propertyyml.config.YmlConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YmlApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(YmlConfiguration.class);
    String str = ctx.getBean(YmlJdbcProperties.class).toString();
    System.out.println(str);
  }
}
