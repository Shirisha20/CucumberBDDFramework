$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium Projects/FacebookBDDFramework/src/main/java/com/qa/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Feature",
  "description": "\r\n\r\nwithout Examples Keyword",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12316294008,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "FaceBook Login Test Scenario",
  "description": "",
  "id": "facebook-login-feature;facebook-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#Given user is already on Login Page"
    }
  ],
  "line": 8,
  "name": "title of login page is Facebook - Log In or Sign Up",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters \"EmailId\" and \"Pwd\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user click on Traingle button",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on Logout button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user is on Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.title_of_login_page_is_Facebook_Log_In_or_Sign_Up()"
});
formatter.result({
  "duration": 219858171,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EmailId",
      "offset": 13
    },
    {
      "val": "Pwd",
      "offset": 27
    }
  ],
  "location": "LoginSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 5821004119,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 101113127,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Traingle_button()"
});
formatter.result({
  "duration": 1085057323,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_Logout_button()"
});
formatter.result({
  "duration": 80309651,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 1169785347,
  "status": "passed"
});
formatter.after({
  "duration": 1462432162,
  "status": "passed"
});
});