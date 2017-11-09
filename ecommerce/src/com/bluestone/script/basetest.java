package com.bluestone.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.bluestone.generic.iautoconst1;
import com.bluestone.generic.lib;

public class basetest implements iautoconst1
{
	public WebDriver driver;
	
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
@BeforeMethod
public void openapplication()
{
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    driver=new FirefoxDriver();
	String url = lib.getproperty(CONFIG_PATH, "URL");
	driver.get(url);
	Reporter.log("application opned",true);
}

@AfterMethod
public void closeapplication()
{
	driver.close();
}
}
