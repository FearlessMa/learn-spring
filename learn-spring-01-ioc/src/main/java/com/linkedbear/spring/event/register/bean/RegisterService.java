package com.linkedbear.spring.event.register.bean;

import com.linkedbear.spring.event.register.event.RegisterSuccessEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


@Service
public class RegisterService implements ApplicationEventPublisherAware {

  ApplicationEventPublisher publisher;

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    // TODO Auto-generated method stub
    this.publisher = applicationEventPublisher;
  }

  public void register(String username) {
    System.out.println(username + " 注册成功");
    publisher.publishEvent(new RegisterSuccessEvent(username));
  }

}
