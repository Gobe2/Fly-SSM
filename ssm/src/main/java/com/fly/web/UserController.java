package com.fly.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fly.service.UserService;
import com.fly.vo.User;

/**
 * 
 */
@Component
@RequestMapping("/user") // url:模块/资源/{}/细分
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/list",method=RequestMethod.GET)
	public String simple(Model model) {
		List<User> users = userService.getUserList();
		model.addAttribute("users", users);
		return "list";
	}
}
