package com.linkedbear.spring.configuration.b_profile;

import java.util.Map;
import java.util.stream.Stream;

import com.linkedbear.spring.configuration.b_profile.bean.Bartender;
import com.linkedbear.spring.configuration.b_profile.bean.Boss;
import com.linkedbear.spring.configuration.b_profile.config.TavernConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TavernApplication {
  public static void main(String[] args) {
    //  获得空的ctx
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(TavernConfiguration.class);
    // // 设置Profile 值
    // ctx.getEnvironment().setActiveProfiles("city");
    // // 注册 ctx 需要注入ioc容器的配置
    // ctx.register(TavernConfiguration.class);
    // // 刷新容器
    // ctx.refresh();
    String beanNames[] = ctx.getBeanDefinitionNames();
    Stream.of(beanNames).forEach(beanName -> {
      System.out.println(beanName);
    });
    Boss boss = ctx.getBean(Boss.class);
    System.out.println(boss);

    System.out.println("----------");

    Map<String, Bartender> bartenders = ctx.getBeansOfType(Bartender.class);
    bartenders.forEach((beanName, bartender) -> {
      System.out.println(beanName);
      System.out.println(bartender);
    });
  }
}
