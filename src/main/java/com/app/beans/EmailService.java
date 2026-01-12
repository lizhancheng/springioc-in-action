package com.app.beans;

public interface EmailService {
	void sendWelcomeEmail(String email);
	void sendNotification(String email, String message);
}


