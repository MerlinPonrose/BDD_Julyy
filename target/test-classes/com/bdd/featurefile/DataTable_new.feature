Feature: Data Table in BDD Framework


Background:
Given Launch browser and open the url "https://demo.automationtesting.in/Register.html"

Scenario: Validate textbox in registration form using data table
When User send firstname and lastname to the input box
|FirstName|LastName|
|testfname|testlname|
And Click email and enter the value
|Email|
|abc.@gmail.com|
