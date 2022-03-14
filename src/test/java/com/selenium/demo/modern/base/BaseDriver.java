package com.selenium.demo.modern.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.bonigarcia.wdm.WebDriverManager;

@Configuration
public class BaseDriver {	
	@Bean
	public WebDriver getWebDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}
