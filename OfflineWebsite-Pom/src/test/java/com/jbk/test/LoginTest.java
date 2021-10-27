package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.jbk.pages.LoginPage;
import com.utility.ExelUtility;

public class LoginTest extends TestBase {
	
		WebDriver driver;
		LoginPage lp;
	
	@BeforeSuite
	public void browserSetup() {
		driver=initialization();
		reportInit();
		lp = loadLoginPage();
	}
	@Test
	public void verifyBlankData(){
		Assert.assertTrue(lp.blankLogin());
	}
	@Test
	public void verifyTitle(){
	Assert.assertTrue(lp.Login(driver));
}
	@Test
	public void inValidLoginTest() {
		String Uname= ExelUtility.readCell(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx", "login", 2, 0);;
		String Pass= ExelUtility.readCell(System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx", "login", 2, 1);
		lp.inValidLogin(Uname, Pass);
	}}