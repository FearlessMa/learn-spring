package com.linkedbear.spring.postprocessor.i_registryprocessor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class DogRegisterPostProcessor implements BeanDefinitionRegistryPostProcessor {

  @Override
  public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
    // TODO Auto-generated method stub
    System.out.println("dog postProcess");
  }

  @Override
  public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
    String[] beanDefinitionNames = registry.getBeanDefinitionNames();
    for (String beanName : beanDefinitionNames) {
      System.out.println("beanName:" + beanName);
    }
    if (!registry.containsBeanDefinition("dog")) {
      // 构造BeanDefinition，并注册进BeanFactory
      BeanDefinition dogDefinition = BeanDefinitionBuilder.genericBeanDefinition(Dog.class).getBeanDefinition();
      registry.registerBeanDefinition("dog", dogDefinition);
    }

  }

}
