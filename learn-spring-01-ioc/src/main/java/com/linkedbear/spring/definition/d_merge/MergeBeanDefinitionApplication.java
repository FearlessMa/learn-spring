package com.linkedbear.spring.definition.d_merge;

import com.linkedbear.spring.definition.d_merge.bean.Cat;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MergeBeanDefinitionApplication {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("definition/d_merge.xml");
    Cat cat = ctx.getBean(Cat.class);
    System.out.println(cat);
    System.out.println("----");
    BeanDefinition catDefinition = ctx.getBeanFactory().getBeanDefinition("cat");
    System.out.println(catDefinition);
    System.out.println("----");
    BeanDefinition mergedCatDefinition = ctx.getBeanFactory().getMergedBeanDefinition("cat");
    System.out.println(mergedCatDefinition);
  }
}
