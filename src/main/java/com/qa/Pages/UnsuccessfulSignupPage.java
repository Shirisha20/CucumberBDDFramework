package com.qa.Pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Util.TestBase;

import cucumber.api.DataTable;
import junit.framework.Assert;

public class UnsuccessfulSignupPage extends TestBase {
	
	//Page Factory - OR:
	@FindBy(xpath = "//input[@name='firstname']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@name='reg_email_confirmation__']")
	WebElement ReEnterEmail;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	WebElement NewPassword;
	
	@FindBy(xpath = "//select[@id='month']")
	WebElement Month;
	
	@FindBy(xpath = "//select[@id='day']")
	WebElement Day;
	
	@FindBy(xpath = "//select[@id='year']")
	WebElement Year;
	
	@FindBy(xpath = "//input[contains(@name, 'sex') and contains(@value, '1')]")
	WebElement Female;
	
	@FindBy(xpath = "//*[@id='u_0_9']//input[contains(@name, 'sex') and contains(@value, '2')]")
	WebElement Male;
	
	@FindBy(xpath = "//button[@name='websubmit']")
	WebElement CreateAcct;
	
	@FindBy(xpath = "//div[contains(text(), 'What’s your name?')]" )
		 WebElement BlankFNameErrorMsg;
	
	@FindBy(xpath = "//div[contains(text(), 'Please re-enter your email address.')]")
	WebElement BlankEmailIdErrorMsg;
	
	//Initializing the Page Objects:
	public UnsuccessfulSignupPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public void validateHomePageTitle(){
		String HomeTitle = driver.getTitle();
		Assert.assertEquals("Facebook - Log In or Sign Up", HomeTitle);
	}
	
	public void InvalidSignup(DataTable table){
		//Write the code to handle Data Table
		for (Map<String, String> data : table.asMaps(String.class, String.class)) {
			FirstName.clear();
			FirstName.sendKeys(data.get("FName"));
			LastName.clear();
			LastName.sendKeys(data.get("LName"));
			Email.clear();
			Email.sendKeys(data.get("EmailId"));
			ReEnterEmail.clear();
			ReEnterEmail.sendKeys(data.get("ReEmail"));
			NewPassword.clear();
			NewPassword.sendKeys(data.get("Pwd"));
			Select SMonth = new Select(Month);
			SMonth.selectByVisibleText("Feb");
			Select SDay = new Select(Day);
			SDay.selectByIndex(12);
			Select SYear = new Select(Year);
			SYear.selectByIndex(5);
			Female.click();
			CreateAcct.click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		}
	
	public void VerifyBlankFNameErrorMsg() {
		
		String Actual = BlankFNameErrorMsg.getText();
		Assert.assertEquals("What’s your name?", Actual);
	}
		

	public void VerifyBlankEmailIdErrorMsg() {
		String Actual = BlankEmailIdErrorMsg.getText();
		Assert.assertEquals("Please re-enter your email address.", Actual);
	}
	
	}
	

	
	
	


