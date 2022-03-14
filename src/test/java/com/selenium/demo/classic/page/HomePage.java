package com.selenium.demo.classic.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.selenium.demo.classic.base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(how = How.ID, using="loginLink")
	public WebElement signin;

	
	public LoginPage clickOnLogin() {
		signin.click();
		return new LoginPage(webDriver);
	}
	
	public void navigateTo(String url) {
		this.webDriver.navigate().to(url);
	}

}
