package com.linkedbear.spring.annotation.h_propertyxml;

import com.linkedbear.spring.annotation.h_propertyxml.bean.JdbcProperties;
import com.linkedbear.spring.annotation.h_propertyxml.config.XMLPropertiesConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class XMLApplication {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(XMLPropertiesConfiguration.class);
    String str = ctx.getBean(JdbcProperties.class).toString();
    System.out.println(str);
  }
}
