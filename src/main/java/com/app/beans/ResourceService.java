package com.app.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:config/app.properties")
public class ResourceService {
	
	@Value("classpath:/data/users.txt")
	private Resource usersFileResource;
	
	@Value("file:src/main/resources/messages/welcome.txt")
	private Resource welcomeFileResource;
	
	@Value("https://raw.githubusercontent.com/spring-projects/spring-framework/main/README.md")
	private Resource urlResource;
	
	@Autowired
	private ResourceLoader resourceLoader;
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private String appVersion;
	
	public void demonstrateResourceUsage() {
		
	}
	
	private void readClasspathResource() {
		
	}
	
	private void readFileSystemResource() {
		
	}
	
	private void readUrlResource() {
		
	}
	
	private void useResourceLoader() {
		
	}
	
	private void checkResourceExistence() {
		
	}
	
	private void printResourceContent() {
		
	}
	
	private void printFirstLines() {
		
	}
	
	public String readFileContent() {
		return "";
	}
}
