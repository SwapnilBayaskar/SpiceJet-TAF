package com.PageFactory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.Generic.Pojo;

public class SignupPage {
	
	private Pojo objPojo;
	
	public SignupPage(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	By loc_drpTitle = By.xpath("//select[@class='form-control form-select ']");
	By loc_inpFirstname = By.xpath("//input[@id='first_name']");
	By loc_inpLastname = By.xpath("//input[@id='last_name']");
	By loc_drpCountry = By.xpath("//select[@class='form-control form-select']");
	By loc_inpDob = By.xpath("//input[@id='dobDate']");
	By loc_drpMonth = By.xpath("//select[@class='react-datepicker__month-select']");
	By loc_drpYear = By.xpath("//select[@class='react-datepicker__year-select']");
	//By loc_txtMonthDate = By.xpath("//div[@class='react-datepicker__month']");
	By loc_inpMobnumber = By.xpath("//input[@class=' form-control']");
	By loc_inpEmail = By.xpath("//input[@id='email_id']");
	By loc_inpNewpassword = By.xpath("//input[@id='new-password']");
	By loc_inpConfirmpassword = By.xpath("//input[@id='c-password']");
	By loc_chkTermscheckbox = By.xpath("//input[@id='defaultCheck1']");
	By loc_btnSubmit = By.xpath("//button[text()='Submit']");
	
	public void selectTitle(String strVisibleText) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropdownValueByVisibleText(loc_drpTitle, strVisibleText));
	}
	
	public void setFirstname(String strFirstname) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpFirstname, strFirstname));
	}
	
	public void setLastname(String strLastname) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpLastname, strLastname));
	}
	
	public void selectCountry(String strVisibleText) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropdownValueByVisibleText(loc_drpCountry, strVisibleText));
	}
	
	public void clickOnDobCalendor() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_inpDob));
	}
	
	public void selectMonth() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropdownValueByVisibleText(loc_drpMonth, objPojo.getObjUtilities().getMonth()));
	}
	
	public void selectYear() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().selectDropdownValueByVisibleText(loc_drpYear, objPojo.getObjUtilities().getYear()));
	}
	
	public void setDate() {
		By locator = By.xpath("//div[text()='"+objPojo.getObjUtilities().getDay()+"']");
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(locator));
	}
	
	public void setMobileNumber() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpMobnumber, objPojo.getObjUtilities().getMobileNumber(8)));
	}
	
	public void setEmail(String strEmail) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpEmail, strEmail));
	}
	
	public void setPassword(String strPassword) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpNewpassword, strPassword));
	}
	
	public void setConfirmPasswork(String strConfirmPassword) {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().setText(loc_inpConfirmpassword, strConfirmPassword));
	}
	
	public void selectTermsCheckbox() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().click(loc_chkTermscheckbox));
	}
	
	public void switchControlToChildWindow() {
		Assert.assertTrue(objPojo.getObjSeleniumWrapperFunctions().switchToChildWindow());
	}

}
