package com.instamina.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.instamina.springboot.domain.User;

/**
 * @author INstamina
 * @date 2018年10月24日
 * @description 用户数据访问层
 */
public interface UserDao extends JpaRepository<User, Integer> {
	public User findUserByUserId(String userId);
	@Query("select u from User u where u.userId=:userId and u.password=:password")
	public User findByUserIdAndPassword(String userId,String password);
}
