package com.selenium.demo.modern.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import com.selenium.demo.modern.base.BasePage;

@Component
public class HomePage extends BasePage {	
	@FindBy(how = How.ID, using="loginLink")
	public WebElement loginLink;

	public void clickOnLogin() {
		loginLink.click();
	}
}
