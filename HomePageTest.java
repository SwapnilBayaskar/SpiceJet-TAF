package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Generic.BaseTest;
import com.PageFactory.HomePage;

public class HomePageTest extends BaseTest {
	
	private HomePage objHomePage;
	
	public void initilizeWebPages() {
		objHomePage = new HomePage(this);
	}
	
	@BeforeClass
	public void initilizeWebEnv() {
		this.initilizeWebPages();
		this.initilizeWebEnvironment();
	}
	
	@AfterClass
	public void tearDownMethod() {
		this.tearDown();
	}
	
	@Test
	public void TCID_101_VerifySignUpPageIsDisplayed() {
		objHomePage.clickOnSignUpLink();
		objHomePage.switchControlToChildWindow();
		objHomePage.verifySignupPageUrl();
	}

}
