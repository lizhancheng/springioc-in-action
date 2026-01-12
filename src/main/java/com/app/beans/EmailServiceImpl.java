package com.app.beans;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Override
	public void sendWelcomeEmail(String email) {
		System.out.println("发送欢迎邮件到：" + email);
	}
	
	@Override
	public void sendNotification(String email, String message) {
		System.out.println("发送通知到 " + email + "：" + message);
	}
}
