package com.linkedbear.spring.basic_dl.c_oftype;

import java.util.Map;

import com.linkedbear.spring.basic_dl.c_oftype.dao.DemoDao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OfTypeApplication {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("basic_dl/quickstart_oftype.xml");
    //  根据 type 获取所有实现类
    Map<String, DemoDao> beans = ctx.getBeansOfType(DemoDao.class);
    beans.forEach((beanName, bean) -> {
      System.out.println(beanName + ":" + bean);
    });
  }
}
