package com.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.jbk.pages.LoginPage;
import com.Base.TestBase;


public class TestBase {
	FileInputStream fis; 
	WebDriver driver;
	public static Logger log = Logger.getLogger(TestBase.class);
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;
	

	public String readProperty(String key) {
		log.info("reading a property from property file");
		Properties prop = new Properties();
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		log.info("value found in the property filr for the " + key);
		return prop.getProperty(key);
	}

	public void launchApplication() {
		log.info("launching an application");
		driver.get(readProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public WebDriver initialization() {
		log.info("initialising a browser with name" + readProperty("browser"));
		if (readProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:/chromedriver.exe");
			driver = new ChromeDriver();
			launchApplication();
			log.info("chorme browser initialised");
			return driver;
		} else {
			System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("firefox browser initialised");
			launchApplication();
			return driver;
		}}
		public void reportInit() {
			spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/target/Reports/ExtentReport.html");

			report = new ExtentReports();
			report.setSystemInfo("Host Name"," Charu-JBK");
			report.setSystemInfo("Platform","Windows");
			report.setSystemInfo("Enviornment","Test Automation");
			report.attachReporter(spark);
		}
		public String takeScreenShot(String name) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
			try {
				FileUtils.copyFile(src, new File(path));
			} catch (IOException e) {
				e.printStackTrace();
			}
			return path;
		}
	

	




	public LoginPage loadLoginPage(){
		LoginPage lp=new LoginPage(driver);
		return lp;
		
	}
}
		