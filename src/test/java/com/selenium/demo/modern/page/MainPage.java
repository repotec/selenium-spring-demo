package com.selenium.demo.modern.page;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MainPage {
	@Autowired
	HomePage homePage;
	
	@Autowired
	LoginPage loginPage;
	
	@Autowired
	WebDriver webDriver;
	
	@Value("${selenium.applocation.url}")
	String applicationUrl;
	
	public void performLogin() {
		webDriver.navigate().to(applicationUrl);
		homePage.clickOnLogin();
		loginPage.Login("test", "password");
		loginPage.clickOnLogin();
	}
}
