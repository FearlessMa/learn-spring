package com.linkedbear.spring.configuration.z_spi;

import java.util.ServiceLoader;

import com.linkedbear.spring.configuration.z_spi.bean.DemoDao;

public class JdkSpiApplication {
  public static void main(String[] args) {
    ServiceLoader<DemoDao> serviceLoader = ServiceLoader.load(DemoDao.class);
    serviceLoader.iterator().forEachRemaining(dao -> {
      System.out.println(dao);
    });
  }
}
