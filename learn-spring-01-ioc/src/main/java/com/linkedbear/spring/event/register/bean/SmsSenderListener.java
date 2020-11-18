package com.linkedbear.spring.event.register.bean;

import com.linkedbear.spring.event.register.event.RegisterSuccessEvent;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {

  @Override
  public void onApplicationEvent(RegisterSuccessEvent event) {
    // TODO Auto-generated method stub
    System.out.println("监听到用户注册成功，发送短信。。。");
  }
  
}
