package com.jbk.ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserObjectRepository {
@FindBy(xpath="//table[@class='table table-hover']/tbody/tr/th")
public List<WebElement> TotalHeading;

@FindBy(xpath="//table[@class='table table-hover']/tbody/tr[1]/th")
public List<WebElement> HeadingName;
}
