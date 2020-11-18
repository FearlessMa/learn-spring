package com.linkedbear.spring.definition.b_register.impl;

import com.linkedbear.spring.definition.b_register.bean.Person;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class PersonRegister implements ImportBeanDefinitionRegistrar {

  @Override
  public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
    // TODO Auto-generated method stub
    registry.registerBeanDefinition("Person", BeanDefinitionBuilder.genericBeanDefinition(Person.class)
        .addPropertyValue("name", "zhangSan").getBeanDefinition());
  }
}
