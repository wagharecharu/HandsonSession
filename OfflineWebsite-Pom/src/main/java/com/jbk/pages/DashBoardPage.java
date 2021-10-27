package com.jbk.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.DashBoardObjectRepository;

public class DashBoardPage extends DashBoardObjectRepository {
WebDriver driver;
	
	public DashBoardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	

		}



public boolean userLinkClick(){
	usersButton.click();
	String actual=driver.getTitle();
	String expected="JavaByKiran | User";
	if(actual.equals(expected))
{
		return true;}
	else{
		return false;

	}
	


}



public boolean logoutPage() {
	logoutButton.click();
	String actual=driver.getTitle();
	String expected="JavaByKiran | Log in";
	if (actual.equals(expected)){
		return true;
	}
	else{
	return false;}
}public UserPage navigateUserPage(WebDriver driver){
    usersButton.click();
	return new UserPage(driver);}
//public UserPage clickUserButton(){
///	usersButton.click();
	
	//return new UserPage(driver);

//public OperatorsPage clickOperatorsButton(){
	//OperatorsBtn.click();
	//return new OperatorsPage(driver);

//public UsefulLinksPage clickUsefulLinksButton(){
//	UsefulLinksBtn.click();
	//return new UsefulLinksPage(driver);

//public DownloadsPage clickDownloads(){
//	downloadBtn.click();
	//return new DownloadsPage(driver);
}









