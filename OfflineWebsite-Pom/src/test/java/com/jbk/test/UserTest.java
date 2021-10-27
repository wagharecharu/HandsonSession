package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.jbk.pages.DashBoardPage;
import com.jbk.pages.UserPage;

public class UserTest extends TestBase {
	WebDriver driver = null;
	UserPage up = null;

	@BeforeSuite
	public void logineuser() {
		driver=initialization();
		up = loadLoginPage().navigateDashBoardPage(driver).navigateUserPage(driver);
		//up = new UserPage(driver);
	}

	@Test
	public void TotalHeadings(){
Assert.assertTrue(up.TotalHeadings());}
	
	@Test
	public void HeadingName(){
Assert.assertTrue(up.HeadingNames());
}}