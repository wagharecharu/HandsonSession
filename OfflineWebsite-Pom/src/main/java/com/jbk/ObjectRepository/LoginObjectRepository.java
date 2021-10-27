package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginObjectRepository {
	@FindBy(id="email")
	public WebElement email;
	@FindBy(id="password")
	public WebElement pass;
	
	@FindBy(xpath="//button")
	public WebElement button;
	
	@FindBy(xpath="//div[@id='email_error']")
public WebElement errorMsg;
	
}
