package com.selenium.demo.classic.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
	private String CHROMEDRIVER_EXE = "src\\main\\resources\\chromedriver.exe";
	protected WebDriver driver;

	public BaseDriver() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_EXE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
}
