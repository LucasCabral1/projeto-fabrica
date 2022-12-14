package com.projetofabrica.projetofabrica.configuration;
 import org.springframework.context.annotation.Bean;  
 import org.springframework.context.annotation.Configuration;  
 import org.springframework.context.annotation.Primary;  
 import org.springframework.ui.freemarker.FreeMarkerConfigurationFactoryBean;  
 @Configuration  
 public class TemplateConfig {  
      @Primary  
      @Bean   
      public FreeMarkerConfigurationFactoryBean factoryBean() {  
           FreeMarkerConfigurationFactoryBean bean=new FreeMarkerConfigurationFactoryBean();  
           bean.setTemplateLoaderPath("classpath:/templates/email");  
           return bean;  
      }  
 }  