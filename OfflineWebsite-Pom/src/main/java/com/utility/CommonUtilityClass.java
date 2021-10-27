package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilityClass {
	public void sendKeys(WebElement element, String text) {
		 element.sendKeys(text);
	 }
	 public void click(WebElement button) {
		 button.click();
	 }
	 public void clear(WebElement textdata) {
		 textdata.clear();
	 }
	 public String getTextMsg(WebElement actual) {
		 String Act = actual.getText();
		 return Act;
		
	 }
	 public String getErrorMsg(String expected) {
		 String Exp =expected;
		 return Exp;
	 }
		public boolean getImage(WebElement images) {
			return images.isDisplayed();
		}
	public String gettitle( WebDriver driver) {
		return driver.getTitle();
	}
		
	}

	//////////////////////
