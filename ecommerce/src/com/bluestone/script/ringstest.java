package com.bluestone.script;

import org.testng.annotations.Test;

import com.bluestone.pom.ringspage;

public class ringstest extends basetest
{
	@Test(priority=1)
	public void ringsmethod()
	{
		ringspage r=new ringspage(driver);
		r.mousehoveronringstab(driver);
		r.clickonengagementtab();
	}
	

}
