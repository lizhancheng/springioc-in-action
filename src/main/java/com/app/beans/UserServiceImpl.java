package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private EmailService emailService;
	
	@Override
	public void registerUser(String username, String email) {
		System.out.println("注册用户：" + username);
		emailService.sendWelcomeEmail(email);
	}
	
	public String getUserInfo(String username) {
		return "用户信息：" + username + "，邮箱已验证";
	}
}
