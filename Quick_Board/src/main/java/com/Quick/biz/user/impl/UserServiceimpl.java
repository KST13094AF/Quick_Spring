package com.Quick.biz.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quick.biz.user.UserDTO;
import com.Quick.biz.user.UserService;

@Service("userService")
public class UserServiceimpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UserDTO getUser(UserDTO uDTO) {
		return userDAO.getUser(uDTO);
	}
	
}
