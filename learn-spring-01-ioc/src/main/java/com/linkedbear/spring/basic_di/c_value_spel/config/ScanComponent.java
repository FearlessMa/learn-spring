package com.linkedbear.spring.basic_di.c_value_spel.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configurable // 定义为设置配置类
@ComponentScan("com.linkedbear.spring.basic_di.c_value_spel.bean") //  扫描定义路径下 的@Component 注解标识的 类装配到bean容器
@PropertySource("classpath:basic_di/value/red.properties") //引入配置文件
public class ScanComponent {
  
}
