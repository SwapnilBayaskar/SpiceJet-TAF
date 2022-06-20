package com.Scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.Generic.BaseTest;
import com.PageFactory.HomePage;
import com.PageFactory.SignupPage;

public class SignupTest extends BaseTest {
	
	private SignupPage objSignupPage;
	private HomePage objHomePage;
	
	public void initilizeWebPages() {
		objSignupPage = new SignupPage(this);
		objHomePage =  new HomePage(this);
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
	public void TCID_201_VerifySuccessfulSignUp() {
		objHomePage.clickOnSignUpLink();
		this.waitFor(5);
		//objSignupPage.confirmAlert();
		objSignupPage.switchControlToChildWindow();
		objSignupPage.selectTitle("Mr");
		objSignupPage.setFirstname("Swapnil");
		objSignupPage.setLastname("Bayaskar");
		this.waitFor(3);
		objSignupPage.selectCountry("India");
		this.waitFor(3);
		objSignupPage.clickOnDobCalendor();
		objSignupPage.selectMonth();
		objSignupPage.selectYear();
		objSignupPage.setDate();
		this.waitFor(3);
		objSignupPage.setMobileNumber();
		this.waitFor(5);
		objSignupPage.setEmail("swapnil@gmail.com");
		this.waitFor(3);
		objSignupPage.setPassword("Admin123");
		this.waitFor(3);
		objSignupPage.setConfirmPasswork("Admin123");
		this.waitFor(3);
		objSignupPage.selectTermsCheckbox();
	}

}
