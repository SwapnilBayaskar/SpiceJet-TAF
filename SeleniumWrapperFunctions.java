package com.Generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWrapperFunctions {
	
	private Pojo objPojo;
	
	public SeleniumWrapperFunctions(Pojo pojo) {
		this.objPojo = pojo;
	}
	
	
	public boolean click(By locator) {
		try {
			objPojo.getDriver().findElement(locator).click();
			return true;
			
		} catch (NoSuchElementException exception) {
			System.out.println("Got Exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean setText(By locator, String strInputValue) {
		try {
			objPojo.getDriver().findElement(locator).sendKeys(strInputValue);
			return true;
			
		} catch (NoSuchElementException exception) {
			System.out.println("Got Error : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public boolean selectDropdownValueByVisibleText(By locator, String strVisibleText) {//select by visible
		try {
			Select drpDown = new Select(objPojo.getDriver().findElement(locator));
			drpDown.selectByVisibleText(strVisibleText);
			return true;
			
		} catch (Exception exception) {
			System.out.println("Got Exception : "+exception.getMessage());
			exception.printStackTrace();
			return false;
		}
	}
	
	public String getCurrentUrl() {
		try {
			String strCurrentUrl = objPojo.getDriver().getCurrentUrl();
			return strCurrentUrl;
		} catch (Exception exception) {
			System.out.println("Got Exception : "+exception.getMessage());
			exception.printStackTrace();
			return null;
		}
	}
	
	public boolean switchToChildWindow() {
		try {
				
				String strParentWindow = objPojo.getDriver().getWindowHandle();
				Set<String> allWindow = objPojo.getDriver().getWindowHandles();
				
				Iterator<String> iterator = allWindow.iterator();
				
				while(iterator.hasNext()) {
					String strChildWindow = iterator.next();
					
					
					if (!strParentWindow.equals(strChildWindow)) {
						objPojo.getDriver().switchTo().window(strChildWindow);						
					}
													
				}
			return true;			
		} catch (Exception exception) {
			System.out.println("Got Exception : "+exception.getMessage());
			exception.printStackTrace();
			
			return false;
		}
	}

}
