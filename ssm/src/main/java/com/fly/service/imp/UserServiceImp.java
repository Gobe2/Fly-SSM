package com.fly.service.imp;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fly.dao.UserDao;
import com.fly.service.UserService;
import com.fly.vo.User;

@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserDao userDao;

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public List<User> getUserList() {
		logger.info("获取用户列表");
		List<User> users =  userDao.queryAll();
		User user = new User();
		user.setUser("张三");
		user.setPassword("****");
		users.add(user);
		return users;
	}
}
