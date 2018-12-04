package com.instamina.springboot.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author INstamina
 * @date 2018年10月24日
 * @description 
 */
public class LogUtil {
	private static final Logger log = LoggerFactory.getLogger(LogUtil.class);
	
	public static Logger log() {
		return log;
	}
}
