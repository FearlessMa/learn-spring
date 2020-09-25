package com.linkedbear.spring.configuration.c_conditional.impl;

import com.linkedbear.spring.configuration.c_conditional.bean.Waiter;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class WaiterRegistrar implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    // TODO Auto-generated method stub
    registry.registerBeanDefinition("waiter", new RootBeanDefinition(Waiter.class));
  }

}
