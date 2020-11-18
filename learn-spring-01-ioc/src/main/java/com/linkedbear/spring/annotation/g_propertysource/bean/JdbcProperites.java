package com.linkedbear.spring.annotation.g_propertysource.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JdbcProperites {
  @Value("${jdbc.url}")
  private String url;

  @Value("${jdbc.driver-class-name}")
  private String driverClassName;

  @Value("${jdbc.username}")
  private String username;

  @Value("${jdbc.password}")
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

    return username + "," + password + "," + driverClassName + "," + url;
  }

}
