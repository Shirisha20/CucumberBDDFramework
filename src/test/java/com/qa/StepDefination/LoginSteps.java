package com.qa.StepDefination;

import com.qa.Pages.HomePage;
import com.qa.Pages.LoginPage;
import com.qa.Util.TestBase;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends TestBase {
	LoginPage loginPage;
	HomePage homePage;

	/*
	 * @Given("^user is already on Login Page$") public void
	 * user_is_already_on_Login_Page() throws Throwable { TestBase.initialization();
	 * }
	 */

	@When("^title of login page is Facebook - Log In or Sign Up$")
	public void title_of_login_page_is_Facebook_Log_In_or_Sign_Up() throws Throwable {
		loginPage = new LoginPage();
		String Title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", Title);

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String arg1, String arg2) throws Throwable {
		homePage = loginPage.login(prop.getProperty("EmailId"), prop.getProperty("Pwd"));

	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
		loginPage.VerifyUserName();
	}

	@When("^user click on Traingle button$")
	public void user_click_on_Traingle_button() throws Throwable {
		loginPage.isEnabled();
		loginPage.ClickTraingleBtn();
	}

	@When("^click on Logout button$")
	public void click_on_Logout_button() throws Throwable {
		loginPage.ClickLogout();
	}

	@Then("^user is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		loginPage.VerifyApplicationName();
	}

	/*
	 * @Then("^Close Browser$") public void close_Browser() throws Throwable {
	 * loginPage.CloseBrowser(); }
	 */

}
