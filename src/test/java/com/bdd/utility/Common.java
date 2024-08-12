package com.bdd.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.stepdefinition.BaseClass;

public class Common extends BaseClass{
	
	
	public void entervalue(By loc, String value)
	{
		WebElement ele = driver.findElement(loc);
		ele.click();
		ele.clear();
		ele.sendKeys(value);
	}

}
