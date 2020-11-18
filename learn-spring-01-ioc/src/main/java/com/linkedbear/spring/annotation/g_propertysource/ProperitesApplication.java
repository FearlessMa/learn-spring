package com.linkedbear.spring.annotation.g_propertysource;

import com.linkedbear.spring.annotation.g_propertysource.bean.JdbcProperites;
import com.linkedbear.spring.annotation.g_propertysource.config.ProperitesConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProperitesApplication {
  public static void main(String[] args) {
    
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProperitesConfiguration.class);
  
    String str = ctx.getBean(JdbcProperites.class).toString();
    System.out.println(str);
  }
}
