package com.PageFactory;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.Pojo;



public class HomePage {
	
	private Pojo objPojo;
	
	public HomePage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By loc_txtSignup = By.xpath("//div[text()='Signup']");
	
	public void clickOnSignUpLink() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_txtSignup));
	}
	
	public void verifySignupPageUrl() {
		String strExpectedUrl = "https://spiceclub.spicejet.com/signup";
		Assert.assertEquals(objPojo.getObjSeleniumWrapperFunctions().getCurrentUrl(), strExpectedUrl);
	}
	
	public void switchControlToChildWindow() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().switchToChildWindow());
	}

}
