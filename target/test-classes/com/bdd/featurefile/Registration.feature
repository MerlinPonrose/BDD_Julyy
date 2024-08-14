Feature: Registration form

Background:
Given Launch browser and open the url "https://demo.automationtesting.in/Register.html"

@Smoke @regression
Scenario: Validate textbox in registration form
When Click firstname and enter the value "Test First Name"
And Click lastname and enter "Test Lastname" in lastname textbox
And Click email and enter the value "abc.@gmail.com"

@Test
Scenario: Validate check box in Registration form
When User click Cricket checkbox
Then User validate checkbox is checked
