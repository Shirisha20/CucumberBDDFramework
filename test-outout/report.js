$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Feature",
  "description": "\r\n\r\nwithout Examples Keyword",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9067800288,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
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
  "duration": 115562912,
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
  "duration": 5727921447,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 77712088,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_click_on_Traingle_button()"
});
formatter.result({
  "duration": 894484911,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.click_on_Logout_button()"
});
formatter.result({
  "duration": 83119453,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 1053669591,
  "status": "passed"
});
formatter.after({
  "duration": 1821103674,
  "status": "passed"
});
formatter.uri("ReadDataExcelSignup.feature");
formatter.feature({
  "line": 1,
  "name": "Fill a simple form with excel data",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "# Given user is  on Main Page"
    }
  ],
  "line": 4,
  "name": "user enters Signup Credentials with excel row \"\u003crow_index\u003e\" dataset",
  "keyword": "Then "
});
formatter.examples({
  "line": 5,
  "name": "",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;",
  "rows": [
    {
      "cells": [
        "row_index"
      ],
      "line": 6,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 7,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;2"
    },
    {
      "cells": [
        "2"
      ],
      "line": 8,
      "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7142396613,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "# Given user is  on Main Page"
    }
  ],
  "line": 4,
  "name": "user enters Signup Credentials with excel row \"1\" dataset",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 47
    }
  ],
  "location": "ReadDataExcelSignupSteps.user_enters_Signup_Credentials_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 5362556734,
  "status": "passed"
});
formatter.after({
  "duration": 397561288,
  "status": "passed"
});
formatter.before({
  "duration": 8314696377,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Data driven with excel and data sets",
  "description": "",
  "id": "fill-a-simple-form-with-excel-data;data-driven-with-excel-and-data-sets;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "comments": [
    {
      "line": 3,
      "value": "# Given user is  on Main Page"
    }
  ],
  "line": 4,
  "name": "user enters Signup Credentials with excel row \"2\" dataset",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 47
    }
  ],
  "location": "ReadDataExcelSignupSteps.user_enters_Signup_Credentials_with_excel_row_dataset(String)"
});
formatter.result({
  "duration": 4929848303,
  "status": "passed"
});
formatter.after({
  "duration": 423049713,
  "status": "passed"
});
formatter.uri("Signup.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Signup",
  "description": "",
  "id": "facebook-signup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8252349403,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Facebook Create a new Account scenario",
  "description": "",
  "id": "facebook-signup;facebook-create-a-new-account-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "# Given user is  on Home Page"
    }
  ],
  "line": 6,
  "name": "title of Home page is Facebook - Log In or Sign Up",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters Signup Credentials to Sign Up",
  "rows": [
    {
      "cells": [
        "FName",
        "LName",
        "EmailId",
        "ReEmail",
        "Pwd"
      ],
      "line": 8
    },
    {
      "cells": [
        "abc",
        "abcd",
        "abc@gmail.com",
        "abc@gmail.com",
        "test123"
      ],
      "line": 9
    },
    {
      "cells": [
        "cba",
        "cba",
        "cba@gmail.com",
        "cba@gmail.com",
        "test123"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SignupSteps.title_of_Home_page_is_Facebook_Log_In_or_Sign_Up()"
});
formatter.result({
  "duration": 4944595,
  "status": "passed"
});
formatter.match({
  "location": "SignupSteps.user_enters_Signup_Credentials_to_Sign_Up(DataTable)"
});
formatter.result({
  "duration": 3415048432,
  "status": "passed"
});
formatter.after({
  "duration": 399324845,
  "status": "passed"
});
formatter.uri("UnsuccessfulSignup.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Unsuccessful Signup",
  "description": "",
  "id": "facebook-unsuccessful-signup",
  "keyword": "Feature"
});
formatter.before({
  "duration": 8141472898,
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
  "duration": 5303175277,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulSignup.verify_blank_FirstName_error_messege()"
});
formatter.result({
  "duration": 26713359,
  "status": "passed"
});
formatter.after({
  "duration": 392256033,
  "status": "passed"
});
formatter.before({
  "duration": 8122655794,
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
  "duration": 5207081139,
  "status": "passed"
});
formatter.match({
  "location": "UnsuccessfulSignup.verify_blank_EmailId_error_messege()"
});
formatter.result({
  "duration": 24887809,
  "status": "passed"
});
formatter.after({
  "duration": 430198754,
  "status": "passed"
});
});