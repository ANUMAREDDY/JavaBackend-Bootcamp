package com.ar.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages="com.ar")
@PropertySource(value="com/ar/commons/jdbc.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean(name="mysqlds")
	public DriverManagerDataSource createDsForMySQL() {
		DriverManagerDataSource drds= new DriverManagerDataSource();
		drds.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		drds.setUrl(env.getRequiredProperty("jdbc.url"));
		drds.setUsername(env.getRequiredProperty("db.username"));
		drds.setPassword(env.getRequiredProperty("db.password"));
		return drds;
	}

}
