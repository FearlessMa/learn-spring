package com.linkedbear.spring.configuration.b_profile.anno;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.linkedbear.spring.configuration.b_profile.bean.Boss;
import com.linkedbear.spring.configuration.b_profile.bean.Waiter;
import com.linkedbear.spring.configuration.b_profile.config.BarConfiguration;
import com.linkedbear.spring.configuration.b_profile.config.BartenderConfiguration;

import org.springframework.context.annotation.Import;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
// 模块装配引入普通类 配置类 
@Import({ Boss.class, BartenderConfiguration.class, BarConfiguration.class, Waiter.class })
public @interface EnableTavern {

}
