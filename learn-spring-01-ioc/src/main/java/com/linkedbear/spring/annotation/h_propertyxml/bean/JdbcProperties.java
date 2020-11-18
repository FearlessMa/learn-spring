package com.linkedbear.spring.annotation.h_propertyxml.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcProperties {
  @Value("${xml.jdbc.url}")
  private String url;

  @Value("${xml.jdbc.driver-class-name}")
  private String driverClassName;

  @Value("${xml.jdbc.username}")
  private String username;

  @Value("${xml.jdbc.password}")
  private String password;

  public String getDriverClassName() {
    return driverClassName;
  }

  public String getPassword() {
    return password;
  }

  public String getUrl() {
    return url;
  }

  public String getUsername() {
    return username;
  }

  @Override
  public String toString() {
    return "xml:" + username + "," + password + "," + driverClassName + "," + url;
  }

}
