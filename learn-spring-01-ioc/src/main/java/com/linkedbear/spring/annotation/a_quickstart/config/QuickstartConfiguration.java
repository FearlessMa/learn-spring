package com.linkedbear.spring.annotation.a_quickstart.config;

import com.linkedbear.spring.annotation.a_quickstart.bean.Person;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

// 这种使用方式，可以解释为：向 IOC 容器注册一个类型为 Person ，
// id 为 person 的 Bean 。方法的返回值代表注册的类型，方法名代表 Bean 的 id 。
// 当然，也可以直接在 @Bean 注解上显式的声明 Bean 的 id ，只不过在注解驱动的范畴里，它不叫 id 而是叫 name 
@Configurable
public class QuickstartConfiguration {
  @Bean
  public Person person() {
    Person person = new Person();
    person.setAge(18);
    person.setName("John");
    return person ;
  }

  // @Bean(name = "aaa") // 4.3.3之后可以直接写value
  // public Person person() {
  // return new Person();
  // }
}
