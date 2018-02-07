package com.qa.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Selenium Projects\\FacebookBDDFramework\\src\\main\\java\\com\\qa\\Features\\UnsuccessfulSignup.feature", // the
                                                                                                                                           // path
                                                                                                                                           // of
                                                                                                                                           // the
                                                                                                                                           // feature
                                                                                                                                           // files
        glue = { "com/qa/StepDefination" }, // the path of the step definition files
        format = { "pretty:STDOUT", "html:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Html-Report",
                "json:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Json-Report\\cucumber.json",
                "junit:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Juint_xml_Report\\cucumber.xml",
                "com.cucumber.listener.ExtentCucumberFormatter:C:\\Selenium Projects\\FacebookBDDFramework\\Reports\\Cucumber_Extent_Report\\report.html" }, // to
        // generate
        // different
        // types
        // of
        // reporting
        monochrome = true, // display the console output in a proper readable format
        strict = true, // it will check if any step is not defined in step definition file
        dryRun = false// to check the mapping is proper between feature file and step def file
// tags = {"~@SmokeTest" , "~@RegressionTest", "~@End2End"}
)

public class UnsuccessfulSignupTestRunner {

}
