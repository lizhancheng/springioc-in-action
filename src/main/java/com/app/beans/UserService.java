package com.app.beans;

public interface UserService {
	void registerUser(String username, String email);
	String getUserInfo(String username);
}
