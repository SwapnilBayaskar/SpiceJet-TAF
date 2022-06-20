package com.Generic;

import org.openqa.selenium.WebDriver;

public class Pojo {
	
	private WebDriver driver;
	private String strBaseUrl;
	private SeleniumWrapperFunctions objSeleniumWrapperFunctions;
	private Utilities objUtilities;
	
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getStrBaseUrl() {
		return strBaseUrl;
	}
	
	public void setStrBaseUrl(String strBaseUrl) {
		this.strBaseUrl = strBaseUrl;
	}

	public SeleniumWrapperFunctions getObjSeleniumWrapperFunctions() {
		return objSeleniumWrapperFunctions;
	}

	public void setObjSeleniumWrapperFunctions(SeleniumWrapperFunctions objSeleniumWrapperFunctions) {
		this.objSeleniumWrapperFunctions = objSeleniumWrapperFunctions;
	}

	public Utilities getObjUtilities() {
		return objUtilities;
	}

	public void setObjUtilities(Utilities objUtilities) {
		this.objUtilities = objUtilities;
	}
	

	

}
