package com.selenium.demo;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.selenium.demo.modern.page.MainPage;

@SpringBootTest
@TestInstance(Lifecycle.PER_CLASS)
class SeleniumDemoApplicationTests {
	
	@Autowired
	MainPage mainPage;
	
	private CountDownLatch waiter;
	
	@BeforeAll
	public void init() {
		 waiter = new CountDownLatch(1);
	}
	
	@Test
	void performLoginTest() throws InterruptedException {
		mainPage.performLogin();
		waiter.await(5, TimeUnit.SECONDS);
	}

}
