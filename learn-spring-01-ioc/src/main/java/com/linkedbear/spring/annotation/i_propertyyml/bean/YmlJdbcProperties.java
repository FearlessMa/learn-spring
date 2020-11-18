package com.linkedbear.spring.annotation.i_propertyyml.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class YmlJdbcProperties {
  @Value("${yml.jdbc.url}")
  private String url;

  @Value("${yml.jdbc.driver-class-name}")
  private String driverClassName;

  @Value("${yml.jdbc.username}")
  private String username;

  @Value("${yml.jdbc.password}")
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
    return "yml:" + username + "," + password + "," + driverClassName + "," + url;
  }

}
