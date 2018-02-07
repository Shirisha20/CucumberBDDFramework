package com.qa.StepDefination;

import com.qa.Pages.HomePage;
import com.qa.Pages.SignupPage;
import com.qa.Util.TestBase;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps extends TestBase {

	HomePage homePage;
	SignupPage signupPage;

	/*
	 * @Given("^user is  on Home Page$") public void user_is_on_Home_Page() {
	 * TestBase.initialization(); }
	 */

	@When("^title of Home page is Facebook - Log In or Sign Up$")
	public void title_of_Home_page_is_Facebook_Log_In_or_Sign_Up() {
		signupPage = new SignupPage();
		signupPage.validateHomePageTitle();

	}

	@Then("^user enters Signup Credentials to Sign Up$")
	public void user_enters_Signup_Credentials_to_Sign_Up(DataTable table) {
		signupPage.SignupFields(table);

	}

	/*
	 * @Then("^Close the browser$") public void close_the_browser() throws Throwable
	 * { driver.close(); }
	 */

}
