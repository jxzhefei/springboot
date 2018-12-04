package com.instamina.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.instamina.springboot.properties.Teacher;

/**
 * @author INstamina
 * @date 2018年10月25日
 * @description 
 */
@Configuration
public class BeanConfig {
	@Bean
	public Teacher getTeacher() {
		return new Teacher();
	}
}
