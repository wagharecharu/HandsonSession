package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DownloadsPage {
WebDriver driver;
	
	public DownloadsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	

		}
}
