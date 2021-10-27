package com.jbk.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.jbk.ObjectRepository.UserObjectRepository;

public class UserPage extends UserObjectRepository {
	WebDriver driver;

	public UserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	public boolean TotalHeadings(){
		
		
			int actual=TotalHeading.size();
			String act=String.valueOf(actual);
			String expected="8";
			if(act.equals(expected))
		{
				return true;}
			else{
				return false;

			}}
			public boolean HeadingNames(){
				ArrayList<String> exp=new ArrayList<String>();
				exp.add("#");
				exp.add("Username");
				exp.add("Email");
				exp.add("Mobile");
				exp.add("Course");
				exp.add("Gender");
				exp.add("State");
				exp.add("Action");
				ArrayList<String> act=new ArrayList<String>();
				for (WebElement element : HeadingName)
				{
					act.add(element.getText());
				}
				
				if(act.equals(exp))
			{
					return true;}
				else{
					return false;

				}
		
}}