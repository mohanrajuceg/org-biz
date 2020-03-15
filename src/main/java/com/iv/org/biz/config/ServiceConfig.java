package com.iv.org.biz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.iv.org.biz.service.EmployeeService;
import com.iv.org.biz.service.EmployeeServiceImpl;

@Configuration
public class ServiceConfig {

	@Bean
	EmployeeService employeeService() {
		return new EmployeeServiceImpl();
	}
}
