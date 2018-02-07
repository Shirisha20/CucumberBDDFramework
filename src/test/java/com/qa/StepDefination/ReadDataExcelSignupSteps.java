package com.qa.StepDefination;

import com.qa.Pages.ReadDataExcelSignupPage;
import com.qa.Util.TestBase;

import cucumber.api.java.en.Then;

public class ReadDataExcelSignupSteps extends TestBase {
	ReadDataExcelSignupPage readDataExcelSignupPage;

	/*
	 * @Given("^user is  on Main Page$") public void user_is_on_Main_Page() throws
	 * Throwable { TestBase.initialization();
	 * 
	 * }
	 */

	@Then("^user enters Signup Credentials with excel row \"([^\"]*)\" dataset$")
	public void user_enters_Signup_Credentials_with_excel_row_dataset(String arg1) throws Throwable {
		readDataExcelSignupPage = new ReadDataExcelSignupPage();
		readDataExcelSignupPage.InvalidSignupFields(arg1);
	}

}
