package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.jbk.pages.DashBoardPage;
import com.jbk.pages.LoginPage;
import com.jbk.pages.LoginPage;

public class DashBoardTest extends TestBase {

	WebDriver driver;
	DashBoardPage dp;
	LoginPage lp;

	@BeforeSuite
	public void OpenUrl() {
		driver=initialization();
		dp = loadLoginPage().navigateDashBoardPage(driver);
	
	}
	
	@Test
	public void verifyUser(){
		Assert.assertTrue(dp.userLinkClick());
	}
	@Test
	public void wlogout(){
		Assert.assertTrue(dp.logoutPage());//span[text()='Users']e());
	}}
	
