package com.selenium.demo.modern.base;

import javax.annotation.PostConstruct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class BasePage {
	@Autowired
	protected WebDriver webDriver;
	
	@PostConstruct
	public  void init() {
		PageFactory.initElements(webDriver, this);
	}
	
	public void navigateTo(String url) {
		this.webDriver.navigate().to(url);
	}
}
