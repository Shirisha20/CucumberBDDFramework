$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Selenium Projects/FacebookBDDFramework/src/main/java/com/qa/Features/UnsuccessfulSignup.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Unsuccessful Signup",
  "description": "",
  "id": "facebook-unsuccessful-signup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8216957487,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Create a new Account scenario with Blank FirstName",
  "description": "",
  "id": "facebook-unsuccessful-signup;create-a-new-account-scenario-with-blank-firstname",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user enters Signup Credentials with blank firstname",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "EmailId",
        "ReEmail",
        "Pwd"
      ],
      "line": 5
    },
    {
      "cells": [
        "",
        "abcd",
        "abc@gmail.com",
        "abc@gmail.com",
        "test123"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify blank FirstName error messege",
  "keyword": "Then "
});
formatter.match({
  "location": "UnsuccessfulSignup.user_enters_Signup_Credentials_with_blank_firstname(DataTable)"
});
formatter.result({
  "duration": 5200295603,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulSignup.verify_blank_FirstName_error_messege()"
});
formatter.result({
  "duration": 26780449,
  "status": "passed"
});
formatter.after({
  "duration": 414209899,
  "status": "passed"
});
formatter.before({
  "duration": 8174600784,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Create a new Account scenario with Blank EmailId",
  "description": "",
  "id": "facebook-unsuccessful-signup;create-a-new-account-scenario-with-blank-emailid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user enters Signup Credentials with blank EmailId",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "EmailId",
        "ReEmail",
        "Pwd"
      ],
      "line": 11
    },
    {
      "cells": [
        "abc",
        "abcd",
        "abc@gmail.com",
        "",
        "test123"
      ],
      "line": 12
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "verify blank EmailId error messege",
  "keyword": "Then "
});
formatter.match({
  "location": "UnsuccessfulSignup.user_enters_Signup_Credentials_with_blank_EmailId(DataTable)"
});
formatter.result({
  "duration": 5084086899,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulSignup.verify_blank_EmailId_error_messege()"
});
formatter.result({
  "duration": 40665717,
  "status": "passed"
});
formatter.after({
  "duration": 445696446,
  "status": "passed"
});
});