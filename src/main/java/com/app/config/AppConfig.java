package com.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app.beans")
public class AppConfig {
	// 空配置类，仅用于组件扫描
}
