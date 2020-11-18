package com.linkedbear.spring.event.register.bean;

import com.linkedbear.spring.event.register.event.RegisterSuccessEvent;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MessageSenderListener {
  
  @EventListener
  @Order(Integer.MAX_VALUE)
  public void onRegisterSuccessEvent(RegisterSuccessEvent event){
    System.out.println("监听到用户注册成功，发送站内信。。。");
  }
}
