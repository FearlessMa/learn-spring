package com.linkedbear.spring.configuration.c_conditional.conditional;

import com.linkedbear.spring.configuration.c_conditional.bean.Boss;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ExistBossCondition implements Condition {

  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    // TODO Auto-generated method stub
    return context.getBeanFactory().containsBeanDefinition(Boss.class.getName());
  }
  
}
