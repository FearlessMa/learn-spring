package com.linkedbear.spring.annotation.i_propertyyml.factroy;

import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;

public class YmlPropertySourceFactory implements PropertySourceFactory {

  @Override
  public PropertySource<?> createPropertySource(String name, EncodedResource resource) throws IOException {
    System.out.println("name:" + name);
    System.out.println("resource :" + resource);
    System.out.println("resource.getResource() :" + resource.getResource());
    YamlPropertiesFactoryBean yamlPropertiesFactoryBean = new YamlPropertiesFactoryBean();
    // 传入resource资源文件
    yamlPropertiesFactoryBean.setResources(resource.getResource());
    // 直接解析获得Properties对象
    Properties properties = yamlPropertiesFactoryBean.getObject();

    System.out.println("properties:" + properties);
    // 如果@PropertySource没有指定name，则使用资源文件的文件名
    return new PropertiesPropertySource((name != null ? name : resource.getResource().getFilename()), properties);
  }

}
