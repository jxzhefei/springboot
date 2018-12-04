package com.instamina.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.instamina.springboot.dao.UserDao;
import com.instamina.springboot.domain.Result;
import com.instamina.springboot.domain.User;
import com.instamina.springboot.utils.LogUtil;

/**
 * @author INstamina
 *
 */
@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserDao userDao;
	
	@GetMapping(value="/findUserByUserId")
	@ResponseBody
	public Result<User> findUserByUserId(@RequestParam String userId){
		LogUtil.log().info("findUserByUserId()方法执行了...");
		//return userDao.findUserByUserId(userId);
		return new Result<User>(userDao.findUserByUserId(userId));
	}
	@GetMapping("/findUserList")
	public String  findUserList(Model model) {
		List<User> userList = userDao.findAll();
		model.addAttribute("userList", userList);
		model.addAttribute("user", userList.get(0));
		return "index";
	}
	@ResponseBody
	@GetMapping(value="/getByUserIdAndPassword")
	public Result<User> getByUserIdAndPassword(@RequestParam String userId,@RequestParam String password){
		return new Result<User>(userDao.findByUserIdAndPassword(userId, password));
	}
}
