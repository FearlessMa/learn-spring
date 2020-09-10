package com.linkedbear.spring.annotation.b_scan.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable //设置配置类
@ComponentScan("com.linkedbear.spring.annotation.b_scan.bean") // @ComponentScan主要就是定义扫描的路径从中找出标识了需要装配的类自动装配到spring的bean容器中
public class ComponentScanConfiguration {
  
}
