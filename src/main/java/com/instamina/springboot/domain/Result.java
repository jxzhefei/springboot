package com.instamina.springboot.domain;

import com.instamina.springboot.enums.CodeEnum;

/**
 * @author INstamina
 * @date 2018年10月24日
 * @description 
 */
public class Result<T> {
	private String code;
	private String msg;
	private T data;
	/**
	 * 返回成功时的构造方法
	 * @param obj
	 */
	public Result (T obj){
		this.code = CodeEnum.SUCCESS.getCode();
		this.msg = CodeEnum.SUCCESS.getMsg();
		this.data = obj;
	}
	/**
	 * 返回失败时的构造方法
	 * @param ce
	 */
	public Result (CodeEnum ce) {
		this.code = ce.getCode();
		this.msg = ce.getMsg();
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
}
