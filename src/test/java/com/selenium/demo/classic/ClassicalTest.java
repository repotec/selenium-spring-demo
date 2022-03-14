package com.selenium.demo.classic;

import org.openqa.selenium.WebDriver;

import com.selenium.demo.classic.base.BaseDriver;
import com.selenium.demo.classic.page.HomePage;
import com.selenium.demo.classic.page.LoginPage;

public class ClassicalTest {
	public static void main(String[] args) {
		BaseDriver baseDriver = new BaseDriver();
		WebDriver driver = baseDriver.getDriver();
		driver.navigate().to("http://www.eaapp.somee.com/");
		
		HomePage homePage = new HomePage(driver);
		
		LoginPage loginPage = homePage.clickOnLogin();
		
		loginPage.Login("test@email.com", "testpassword");
		loginPage.clickOnLogin();
	}
}
