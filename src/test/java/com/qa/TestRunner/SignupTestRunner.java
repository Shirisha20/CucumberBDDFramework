package com.qa.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
//the path of the feature files
@CucumberOptions(features = "C:\\Selenium Projects\\FacebookBDDFramework\\src\\main\\java\\com\\qa\\Features",
        // the path of the step definition files
        glue = { "com/qa/StepDefination" },
        // To generate Different Types of Reporting
        format = { "pretty:STDOUT", "html:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Html-Report",
                "json:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Json-Report\\cucumber.json",
                "junit:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Juint_xml_Report\\cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Cucumber_Extent_Report\\report.html" },
        // To display the console output in a proper readable format
        monochrome = true,
        // it will check if any step is not defined in step definition file
        strict = true,
        // to check the mapping is proper between feature file and step def file
        dryRun = false
// tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}

)

public class SignupTestRunner extends AbstractTestNGCucumberTests {

}
