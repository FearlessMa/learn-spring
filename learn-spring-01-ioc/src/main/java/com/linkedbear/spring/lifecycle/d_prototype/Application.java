package com.linkedbear.spring.lifecycle.d_prototype;

import com.linkedbear.spring.lifecycle.d_prototype.bean.Pen;
import com.linkedbear.spring.lifecycle.d_prototype.config.PrototypeLifecycleConfiguration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
        PrototypeLifecycleConfiguration.class);
    System.out.println("IOC容器初始化完成。。。");
    Pen pen = ctx.getBean(Pen.class);
    System.out.println("已经取到了Pen。。。");
    System.out.println("用完Pen了，准备销毁。。。");
    ctx.getBeanFactory().destroyBean(pen);
    System.out.println("Pen销毁完成。。。");
    // BeanFactory
  }
}
