package com.jbk.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.jbk.ObjectRepository.LoginObjectRepository;
import com.utility.CommonUtilityClass;

public class LoginPage extends LoginObjectRepository {
	WebDriver driver;
	 CommonUtilityClass act= new CommonUtilityClass();

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean blankLogin(){
	
	act.sendKeys(email," ");
	act.sendKeys(pass," ");
	act.click(button);
	String actual=act.getTextMsg(errorMsg);
	String expected="Please enter email as kiran@gmail.com";
	if(actual.equals(expected)){
		System.out.println("Error msg is match");
		return true;
	}else{
		System.out.println("Error msg is not match");
		return false;
	}

		}
	public boolean Login(WebDriver driver){
		email.clear();
		pass.clear();
		email.sendKeys("kiran@gmail.com");
		pass.sendKeys("123456");
		button.click();
		String actual=driver.getTitle();
		System.out.println(actual);
		String expected="JavaByKiran | Dashboard";
		if(actual.equals(expected)){
			System.out.println("Login with valid credential");
			return true;
		}else{
		System.out.println("Login with Invalid credential");
			return false;
		
		}

			}
	public void inValidLogin(String Uname, String Pass) {
		email.sendKeys(Uname);
		pass.sendKeys(Pass);
	button.click();
	}
	public DashBoardPage navigateDashBoardPage(WebDriver driver){
		 Login(driver);
		return new DashBoardPage(driver);
}}

