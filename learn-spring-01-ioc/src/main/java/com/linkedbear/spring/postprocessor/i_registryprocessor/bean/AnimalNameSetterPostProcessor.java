package com.linkedbear.spring.postprocessor.i_registryprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class AnimalNameSetterPostProcessor implements BeanFactoryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    System.out.println("animal postProcess");

    // TODO Auto-generated method stub
    String[] nameArr = beanFactory.getBeanNamesForType(Animal.class);
    System.out.println("nameArr:" + nameArr);
    for (String name : nameArr) {
      System.out.println(name);
      BeanDefinition beanDefinition = beanFactory.getBeanDefinition(name);
      beanDefinition.getPropertyValues().add("name", name);
    }
  }

}
