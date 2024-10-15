package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(value="com")
public class JavaConfig {
	
	    @Bean
	    public DriverManagerDataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/springframework");
	        dataSource.setUsername("root");
	        dataSource.setPassword("1234");
	        return dataSource;
	    }
	    @Bean
	    public JdbcTemplate jdbcTemplate(DriverManagerDataSource dataSource) {
	        return new JdbcTemplate(dataSource);
	    }

}
