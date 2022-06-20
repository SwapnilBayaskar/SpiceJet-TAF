package com.Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest extends Pojo {
	
	private WebDriver driver;
	private String strBaseUrl;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private Utilities objUtilities;
	
	public void initilizeWebEnvironment() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		strBaseUrl = "https://www.spicejet.com/";
		this.setStrBaseUrl(strBaseUrl);
		driver.get(this.getStrBaseUrl());
		
		this.setDriver(driver);
		
		objSeleniumWrapperFunctions = new SeleniumWrapperFunctions(this);
		this.setObjSeleniumWrapperFunctions(objSeleniumWrapperFunctions);
		
		objUtilities = new Utilities();
		this.setObjUtilities(objUtilities);
		
		driver.manage().window().maximize();
	}
	
	public void tearDown() {
		driver.close();
	}
	
	public void waitFor(int intSeconds) {
		try {
			Thread.sleep(intSeconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
