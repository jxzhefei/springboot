package com.instamina.springboot.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.instamina.springboot.utils.LogUtil;

/**
 * @author INstamina
 * @date 2018年10月25日
 * @description 
 */
@Aspect
@Component
public class LogAspect {
	@Pointcut(value="execution(public * com.instamina.springboot.controller.*.*(..))")
	public void log() {
		
	}
	@Before("log()")
	public void before() {
		LogUtil.log().info("方法执行前。。。");
	}
	@After("log()")
	public void after() {
		LogUtil.log().info("方法执行后。。。");
	}
}
