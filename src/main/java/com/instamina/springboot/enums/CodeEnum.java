package com.instamina.springboot.enums;

/**
 * @author INstamina
 * @date 2018年10月24日
 * @description 
 */
public enum CodeEnum {
	SUCCESS("0000","请求成功"),
	ERROR("0001","系统错误"),
	;
	private String code;
	private String msg;
	
	private CodeEnum(String code,String msg) {
		this.code = code;
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
	
}
