package com.linkedbear.spring.postprocessor.d_factorybean.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class Hen implements FactoryBean<Egg> {

  @Override
  public Egg getObject() throws Exception {
    // TODO Auto-generated method stub
    return new Egg();
  }

  @Override
  public Class<?> getObjectType() {
    // TODO Auto-generated method stub
    return Egg.class;
  }

}
