package com.linkedbear.spring.definition.b_register.config;

import com.linkedbear.spring.definition.b_register.impl.PersonRegister;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersonRegister.class)
public class BeanDefinitionRegistryConfiguration {
  
}
