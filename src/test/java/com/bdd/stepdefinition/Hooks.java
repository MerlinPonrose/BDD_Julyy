package com.bdd.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	
	@Before(order=2)
	public void launchbrowser()
	{

		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	}
	
	@Before(order=1)
	public void precondition() {
		System.out.println("precondition...");
	}
	
	@Before("@multipledata")
	public void precondition_specifiedscenario()
	{
		System.out.println("I am smoke test case");
	}
	
	@After(order=1)
	public void closebrowser()
	{
		driver.quit();
	}
	
	
	@After(order=2)
	public void postcondition()
	{
		System.out.println("postcondition");
	}

}
