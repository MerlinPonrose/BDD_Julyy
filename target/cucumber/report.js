$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Registration.feature");
formatter.feature({
  "name": "Registration form",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Launch browser and open the url \"https://demo.automationtesting.in/Register.html\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Registrationn.launchbrowser(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validate check box in Registration form",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User click Cricket checkbox",
  "keyword": "When "
});
formatter.match({
  "location": "Registrationn.user_click_Cricket_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validate checkbox is checked",
  "keyword": "Then "
});
formatter.match({
  "location": "Registrationn.user_validate_checkbox_is_checked()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User validate this new step",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});