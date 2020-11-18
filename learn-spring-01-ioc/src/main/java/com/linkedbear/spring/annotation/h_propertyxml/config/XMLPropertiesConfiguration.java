package com.linkedbear.spring.annotation.h_propertyxml.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.linkedbear.spring.annotation.h_propertyxml.bean")
@PropertySource("classpath:propertysource/jdbc.xml")
public class XMLPropertiesConfiguration {
  
}
