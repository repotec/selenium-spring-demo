package com.selenium.demo.modern.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import com.selenium.demo.modern.base.BasePage;

@Component
public class LoginPage extends BasePage {
	
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
