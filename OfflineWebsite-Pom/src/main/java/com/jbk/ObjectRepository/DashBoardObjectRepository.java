package com.jbk.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoardObjectRepository {
	
	
	@FindBy(xpath="//span[text()='Users']")
	public WebElement usersButton;
	@FindBy(xpath="//a[text()='LOGOUT']")
	public WebElement logoutButton;
	
	
	
	@FindBy(xpath="//span[text()='Operators']")
	public WebElement OperatorsBtn;
	
	@FindBy(xpath="//span[text()='Useful Links']")
	public WebElement UsefulLinksBtn;
	
	@FindBy(xpath="//span[text()='Downloads']")
	public WebElement downloadBtn;
	
}
