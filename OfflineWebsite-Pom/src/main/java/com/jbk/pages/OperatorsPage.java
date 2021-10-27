package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OperatorsPage {
WebDriver driver;
	
	public OperatorsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	

		}
}
