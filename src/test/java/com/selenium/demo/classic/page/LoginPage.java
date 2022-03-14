package com.selenium.demo.classic.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.selenium.demo.classic.base.BasePage;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver webDriver) {
		super(webDriver);
	}
	
	@FindBy(how = How.NAME, using="UserName")
	public WebElement username;
	
	@FindBy(how = How.NAME, using="Password")
	public WebElement password;
	
	@FindBy(how = How.CSS, using=".btn-default")
	public WebElement loginBtn;
	
	
	public void Login(String username, String password) {
		this.username.sendKeys(username);
		this.password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		loginBtn.click();
	}
}
