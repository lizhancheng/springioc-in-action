package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.beans.UserService;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("=== 使用注解配置方式 ===");
		useAnnotationConfig();
		
		System.out.println("\n=== 使用XML配置方式 ===");
		useXmlConfig();
	}
	
	private static void useAnnotationConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.app.config");
		
		UserService userService = context.getBean(UserService.class);
		
		userService.registerUser("张三", "zhangsan@example.com");
		String info = userService.getUserInfo("张三");
		
		System.out.println(info);
		
		((AnnotationConfigApplicationContext) context).close();
	}
	
	private static void useXmlConfig() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = context.getBean("userServiceImpl", UserService.class);
		
		userService.registerUser("李四", "lisi@example.com");
		
		((ClassPathXmlApplicationContext) context).close();
	}
}