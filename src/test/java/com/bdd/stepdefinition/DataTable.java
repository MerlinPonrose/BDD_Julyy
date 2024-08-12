package com.bdd.stepdefinition;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import cucumber.api.java.en.When;

public class DataTable extends BaseClass{
	
	

private static final Type String = null;


@When("User send firstname and lastname to the input box")
public void user_send_firstname_and_lastname_to_the_input_box(io.cucumber.datatable.DataTable dataTable) {

	//asLists()
	/* List<List<String>> l2 = dataTable.asLists();
	
	reg.enterFirstname(l2.get(0).get(0));
	reg.enterlastname(l2.get(0).get(1));*/
	
	//asMaps()
	
	List<Map<String, String>> asMaps = dataTable.asMaps();

	reg.enterFirstname(asMaps.get(0).get("FirstName"));
	reg.enterlastname(asMaps.get(0).get("LastName"));
	
}


@When("Click email and enter the value")
public void click_email_and_enter_the_value(io.cucumber.datatable.DataTable dataTable) {
	
	Map<String, String> asMap = dataTable.asMap(String, String);
	
	reg.enteremail(asMap.get("Email"));
	
	
	/*List<String> l2 = dataTable.asList();
	
	
	int size = l2.size();
	
	for(int i=0;i<size;i++)
	{
		reg.enteremail(l2.get(i));
	}
	
   */
	
	
}




}
