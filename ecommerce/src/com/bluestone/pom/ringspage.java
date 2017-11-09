package com.bluestone.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ringspage 
{

@FindBy(linkText="https://www.bluestone.com/jewellery/engagement-rings.html")
private WebElement Engagement;

@FindBy(linkText="https://www.bluestone.com/jewellery/rings.html")
private WebElement rings;



public ringspage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void mousehoveronringstab(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	Actions actions=new Actions(driver);
	actions.moveToElement(rings).perform();
	Reporter.log("mousehover on rings tab",true);
}

public void clickonengagementtab()
{
	Engagement.click();
	Reporter.log("engagement tab has been clicke",true);
}

}
