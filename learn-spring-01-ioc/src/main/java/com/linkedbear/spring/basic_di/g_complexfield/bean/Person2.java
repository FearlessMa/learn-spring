package com.linkedbear.spring.basic_di.g_complexfield.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person2 {
  @Value("#{new String [] {'张三', '李四'}}")
  private String[] names;
  @Value("#{{'1234','4321'} }")
  private List<String> tels;
  // 引用现有的Bean，以及创建新的Bean
  @Value("#{{@miaomiao, new com.linkedbear.spring.basic_di.g_complexfield.bean.Cat()}}")
  private Set<Cat> cats;

  @Value("#{{'mimi':@miaomiao.name, 'aa':new com.linkedbear.spring.basic_di.g_complexfield.bean.Cat().name}}")
  private Map<String, Object> events;

  @Value("#{{'name':'sss', age:'18'}}")
  private Properties props;

  @Override
  public String toString() {
    return "Person{\n" + " names=" + Arrays.toString(names) + ",\n tels=" + tels + ",\n cats=" + cats + ",\n events="
        + events + ",\n props=" + props + "\n}";
  }
}
