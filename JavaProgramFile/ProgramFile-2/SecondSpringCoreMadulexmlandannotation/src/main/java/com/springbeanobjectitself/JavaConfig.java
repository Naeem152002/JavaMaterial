package com.springbeanobjectitself;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.springbeanobjectitself")
@Component
public class JavaConfig {
//itself object create 
@Bean(name="employee")
public Employee getEmp() {
	return new Employee();
}
}
