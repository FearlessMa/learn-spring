package com.linkedbear.spring.annotation.i_propertyyml.config;

import com.linkedbear.spring.annotation.i_propertyyml.factroy.YmlPropertySourceFactory;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.linkedbear.spring.annotation.i_propertyyml.bean")
@PropertySource(value = "classpath:propertysource/jdbc.yml", factory = YmlPropertySourceFactory.class)
public class YmlConfiguration {
  
}
