package com.instamina.springboot.properties;


import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author INstamina
 * @date 2018年10月24日
 * @description 
 */
//@Component
@ConfigurationProperties(prefix="teacher")
public class Teacher {
	
	private String name;
	private String age;
	private String sex;
	private List<String> teachClassList;//所带班级
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public List<String> getTeachClassList() {
		return teachClassList;
	}
	public void setTeachClassList(List<String> teachClassList) {
		this.teachClassList = teachClassList;
	}
}
