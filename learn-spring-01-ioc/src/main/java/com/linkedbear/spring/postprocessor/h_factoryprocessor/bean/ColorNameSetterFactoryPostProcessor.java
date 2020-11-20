package com.linkedbear.spring.postprocessor.h_factoryprocessor.bean;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;

@Component
public class ColorNameSetterFactoryPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    // TODO Auto-generated method stub
    String[] bdNames = beanFactory.getBeanDefinitionNames();
    System.out.println("**********bdNames:************" + bdNames);
    Stream.of(bdNames).forEach((bdname) -> {
      System.out.println("bdname：" + bdname);
      System.out.println("-----");
      BeanDefinition beanDefinition = beanFactory.getBeanDefinition(bdname);
      System.out.println("beanDefinition：" + beanDefinition);
      System.out.println("-----");
      System.out.println(beanDefinition.getBeanClassName());
      System.out.println("-----");
      if (StringUtils.hasText(beanDefinition.getBeanClassName())) {
        System.out.println("this：" + this);
        System.out.println("-----");
        if (ClassUtils.resolveClassName(beanDefinition.getBeanClassName(), this.getClass().getClassLoader())
            .getSuperclass().equals(Color.class)) {
          beanDefinition.getPropertyValues().add("name", bdname);
          beanDefinition.getPropertyValues().add("tag", bdname);
          List<PropertyValue> propList = beanDefinition.getPropertyValues().getPropertyValueList();
          System.out.println(propList);
          propList.forEach((name) -> {
            System.out.println("prop:" + name);
          });
          // System.out.println("beanDefinition:"+beanDefinition);
        }
        System.out.println("-----");
      }
    });
  }

}
