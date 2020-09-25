package com.linkedbear.spring.configuration.b_profile.impl;

import com.linkedbear.spring.configuration.b_profile.bean.Bar;
import com.linkedbear.spring.configuration.b_profile.config.BarConfiguration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BarImportSelector implements ImportSelector {

  @Override
  public String[] selectImports(AnnotationMetadata importingClassMetadata) {
    // TODO Auto-generated method stub
    return new String[] { Bar.class.getName(), BarConfiguration.class.getName() };
  }

}
