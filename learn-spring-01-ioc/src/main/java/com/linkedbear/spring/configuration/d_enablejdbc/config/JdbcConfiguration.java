package com.linkedbear.spring.configuration.d_enablejdbc.config;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSource;
import com.linkedbear.spring.configuration.d_enablejdbc.annotation.ConditionalOnClassName;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcConfiguration {

  @Bean
  @ConditionalOnClassName("com.mysql.jdbc.Driver")
  public DataSource dataSource() {
    DruidDataSource dataSource = new DruidDataSource();
    dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    dataSource.setUrl("jdbc:mysql://localhost:3306/test?characterEncoding=utf8");
    dataSource.setUsername("root");
    dataSource.setPassword("123456");
    return dataSource;
  }

  @Bean
  public QueryRunner queryRunner(DataSource dataSource){
    return new QueryRunner(dataSource);
  }
}
