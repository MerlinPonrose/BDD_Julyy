package com.bdd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Registrationn extends BaseClass{
	

	
	@Given("Launch browser and open the url {string}")
	public void launchbrowser(String url) {
		

		
		driver.get(url);
		
	    
	}

	@When("Click firstname and enter the value {string}")
	public void click_firstname_and_enter_the_value(String fname) {
		reg.enterFirstname(fname);
	}

	@When("Click lastname and enter {string} in lastname textbox")
	public void click_lastname_and_enter_in_lastname_textbox(String lastname) {
		reg.enterlastname(lastname);

	}

	@When("Click email and enter the value {string}")
	public void click_email_and_enter_the_value(String email) {

	 reg.enteremail(email);
	}

	@When("User click Cricket checkbox")
	public void user_click_Cricket_checkbox() {
		
		WebElement ele = driver.findElement(By.id("checkbox1"));
		ele.click();
	  
	}

	@Then("User validate checkbox is checked")
	public void user_validate_checkbox_is_checked() {
		
		WebElement ele = driver.findElement(By.id("checkbox1"));
		if(ele.isSelected())
		{
			System.out.println("Checkbox is clicked");
		}
		else
		{
			System.out.println("checkbox is not clicked");
		}
	   
	}
	
	



}
