package com.qa.StepDefination;

import com.qa.Pages.UnsuccessfulSignupPage;
import com.qa.Util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UnsuccessfulSignup extends TestBase {

	UnsuccessfulSignupPage unsuccessfulSignupPage;

	@Before
	public void SetUp() {
		TestBase.initialization();
		// unsuccessfulSignupPage.validateHomePageTitle();
	}

	@When("^user enters Signup Credentials with blank firstname$")
	public void user_enters_Signup_Credentials_with_blank_firstname(DataTable table) {
		unsuccessfulSignupPage = new UnsuccessfulSignupPage();
		unsuccessfulSignupPage.InvalidSignup(table);
	}

	@Then("^verify blank FirstName error messege$")
	public void verify_blank_FirstName_error_messege() {
		unsuccessfulSignupPage.VerifyBlankFNameErrorMsg();

	}

	@When("^user enters Signup Credentials with blank EmailId$")
	public void user_enters_Signup_Credentials_with_blank_EmailId(DataTable table) {
		unsuccessfulSignupPage = new UnsuccessfulSignupPage();
		unsuccessfulSignupPage.InvalidSignup(table);
	}

	@Then("^verify blank EmailId error messege$")
	public void verify_blank_EmailId_error_messege() {
		unsuccessfulSignupPage.VerifyBlankEmailIdErrorMsg();
	}

	@After
	public void closeBrowser() {
		TestBase.TearDown();
	}

}
