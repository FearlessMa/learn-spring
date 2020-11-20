package com.linkedbear.spring.configuration.d_enablejdbc.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.linkedbear.spring.configuration.d_enablejdbc.config.JdbcConfiguration;

import org.springframework.context.annotation.Import;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
//模块装配要配合 @Import 注解一起使用，此处我们可以使用 @Import 导入一个注册数据源的配置类，
// 在配置类中完成注册数据源、加载连接池配置等工作。
@Import(JdbcConfiguration.class) 
public @interface EnableJdbc {
  
}
