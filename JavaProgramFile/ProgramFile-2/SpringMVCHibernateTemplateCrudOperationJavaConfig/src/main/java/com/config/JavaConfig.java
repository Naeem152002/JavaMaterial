package com.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(value="com")
@EnableTransactionManagement
public class JavaConfig {
	
	@Bean
	public Properties hibernateProperties() {
		Properties hibernateProperties=new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
		return hibernateProperties;
		
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/hibernate");
		dataSource.setUsername("root");
		dataSource.setPassword("1234");
		return dataSource;
		
	}
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		LocalSessionFactoryBean factory=new LocalSessionFactoryBean();
		factory.setDataSource(dataSource());
		factory.setMappingResources("user.hbm.xml");
		factory.setHibernateProperties(hibernateProperties());
		return factory;
	}
	@Bean
	public HibernateTransactionManager hibernateTrnasactionManger(SessionFactory factory) {
		return new HibernateTransactionManager(factory);
	}
	
	@Bean
	public HibernateTemplate hibernateTemplate(SessionFactory factory) {
		return new HibernateTemplate(factory);
	}
	

}
