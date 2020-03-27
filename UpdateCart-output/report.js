$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/UpdateCart.feature");
formatter.feature({
  "name": "TestCase",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Remove",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch browser with JpetStorePage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Launch_browser_with_JpetStorePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Update Cart",
  "keyword": "When "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_Update_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.cts.StepDefinitions.StepDefinition.user_close_browser()"
});
formatter.result({
  "status": "passed"
});
});