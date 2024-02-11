package com.ar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.ar.replacer")
@ImportResource("com/ar/cfgs/applicationContext.xml")
public class AppConfig {

}
