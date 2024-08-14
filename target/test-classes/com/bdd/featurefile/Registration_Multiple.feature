@multipledata
Feature: Testing registrationform with multiple data

@Regression
Scenario Outline: Registration form with multiple data
Given Launch browser and open the url "https://demo.automationtesting.in/Register.html"
When Click firstname and enter the value "<FirstName>"
And Click lastname and enter "<LastName>" in lastname textbox
And Click email and enter the value "<Email>"

Examples:
|FirstName|LastName|Email|
|Test First Name|Test Lastname|abc.@gmail.com|
|aa|bb|abc|
|testname|testlastname|abc.|


@regression
Scenario: Validate check box in Registration form
When User click Cricket checkbox
Then User validate checkbox is checked
