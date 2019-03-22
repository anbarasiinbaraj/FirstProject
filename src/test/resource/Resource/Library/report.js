$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality module of automation practise Webpage",
  "description": "Contains E2E functionality such as login, add a product to cart, Place Order and SignOut.",
  "id": "login-functionality-module-of-automation-practise-webpage",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#@Sce1"
    },
    {
      "line": 5,
      "value": "#Scenario: User Launch browser and navigate to application"
    },
    {
      "line": 6,
      "value": "#Given  Navigate to application"
    }
  ],
  "line": 9,
  "name": "Verify the user login the application with valid credentials.",
  "description": "",
  "id": "login-functionality-module-of-automation-practise-webpage;verify-the-user-login-the-application-with-valid-credentials.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Sce1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the valid username \"\u003cUserName\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the valid password \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User validate the username \"\u003cLoginVP\u003e\" displayed in the header",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Quit Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-functionality-module-of-automation-practise-webpage;verify-the-user-login-the-application-with-valid-credentials.;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password",
        "LoginVP"
      ],
      "line": 18,
      "id": "login-functionality-module-of-automation-practise-webpage;verify-the-user-login-the-application-with-valid-credentials.;;1"
    },
    {
      "cells": [
        "Anbarasi",
        "83YR4E",
        "Hello Anbarasi!"
      ],
      "line": 19,
      "id": "login-functionality-module-of-automation-practise-webpage;verify-the-user-login-the-application-with-valid-credentials.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Verify the user login the application with valid credentials.",
  "description": "",
  "id": "login-functionality-module-of-automation-practise-webpage;verify-the-user-login-the-application-with-valid-credentials.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Sce1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "Navigate to application",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User enter the valid username \"Anbarasi\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User enter the valid password \"83YR4E\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click the signin button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User validate the username \"Hello Anbarasi!\" displayed in the header",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User close the browser",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User Quit Browser",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.navigate_to_application()"
});
formatter.result({
  "duration": 1252562193,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anbarasi",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_username(String)"
});
formatter.result({
  "duration": 425811626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "83YR4E",
      "offset": 31
    }
  ],
  "location": "Stepdefinition.user_enter_the_valid_password(String)"
});
formatter.result({
  "duration": 250133429,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_click_the_signin_button()"
});
formatter.result({
  "duration": 677449619,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Hello Anbarasi!",
      "offset": 28
    }
  ],
  "location": "Stepdefinition.user_validate_the_username_displayed_in_the_header(String)"
});
formatter.result({
  "duration": 37845070,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_close_the_browser()"
});
formatter.result({
  "duration": 315703092,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.user_Quit_Browser()"
});
formatter.result({
  "duration": 738160819,
  "status": "passed"
});
});