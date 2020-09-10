package com.linkedbear.spring.basic_dl.b_bytype;

import com.linkedbear.spring.basic_dl.b_bytype.bean.Person;
import com.linkedbear.spring.basic_dl.b_bytype.dao.impl.DemoDaoImpl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QuickstartByNameApplication {
  public static void main(String[] args) {
    BeanFactory factory = new ClassPathXmlApplicationContext("basic_dl/quickstart_bytype.xml");
    Person person = factory.getBean(Person.class);
    System.out.println(person);
    DemoDaoImpl demoDao = factory.getBean(DemoDaoImpl.class);
    System.out.println(demoDao.findAll());
  }
}
