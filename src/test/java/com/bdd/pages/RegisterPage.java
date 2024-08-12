package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.stepdefinition.BaseClass;

public class RegisterPage extends BaseClass{
	
	public By firstname = By.xpath("//input[@ng-model='FirstName']");
	public By lastname = By.xpath("//input[@ng-model='LastName']");
	public By emaill = By.xpath("//input[@ng-model='EmailAdress']");

	
	public void enterFirstname(String fname)
	{
		com.entervalue(firstname, fname);
	}
	
	public void enterlastname(String lname)
	{
		com.entervalue(lastname, lname);
	}
	
	public void enteremail(String email)
	{
		com.entervalue(emaill, email);
	}
}
