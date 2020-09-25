package com.linkedbear.spring.annotation.e_basepackageclass.config;

import com.linkedbear.spring.annotation.e_basepackageclass.bean.DemoService;
import com.linkedbear.spring.annotation.e_basepackageclass.component.DemoComponent;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//  basePackageClasses 扫描类所在的包下所有 class
@ComponentScan(basePackageClasses = { DemoService.class, DemoComponent.class })
public class BasePackageClassConfiguration {

}
