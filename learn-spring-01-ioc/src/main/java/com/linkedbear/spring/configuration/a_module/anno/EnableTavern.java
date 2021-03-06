package com.linkedbear.spring.configuration.a_module.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.linkedbear.spring.configuration.a_module.bean.Boss;
import com.linkedbear.spring.configuration.a_module.bean.Waiter;
import com.linkedbear.spring.configuration.a_module.config.BarConfiguration;
import com.linkedbear.spring.configuration.a_module.config.BartenderConfiguration;

import org.springframework.context.annotation.Import;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// 模块装配引入普通类 配置类 
@Import({ Boss.class, BartenderConfiguration.class, BarConfiguration.class, Waiter.class })
public @interface EnableTavern {

}
