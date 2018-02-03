package com.qa.Pages;

import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.Helpers.DataHelper;
import com.qa.Util.TestBase;

import junit.framework.Assert;


public class ReadDataExcelSignupPage extends TestBase {

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

	@FindBy(xpath = "//input[contains(@name, 'sex') and contains(@value, '2')]")
	WebElement Male;

	@FindBy(xpath = "//*[@name='websubmit']")
	WebElement CreateAcct;

	@FindBy(xpath = "//*[@id='reg_error_inner']")
	WebElement ErrorMsg;
	
		//Initializing the Page Objects:
	public ReadDataExcelSignupPage(){
		PageFactory.initElements(driver, this);

	}

	public void InvalidSignupFields(String arg1){

		List<HashMap<String,String>> datamap = DataHelper.data(System.getProperty("user.dir")+"\\src\\main\\java\\com\\qa\\TestData\\ReadDataExcelCucumber.xlsx","Sheet1");
		int index = Integer.parseInt(arg1)-1;
		System.out.println("Printing current data set...");
	for(HashMap h:datamap)
		{
			System.out.println(h.keySet());
			System.out.println(h.values());
		}
			FirstName.clear();
			FirstName.sendKeys(datamap.get(index).get("FName"));
			LastName.clear();
			LastName.sendKeys(datamap.get(index).get("LName"));
			Email.clear();
			Email.sendKeys(datamap.get(index).get("mailId"));
			ReEnterEmail.clear();
			ReEnterEmail.sendKeys(datamap.get(index).get("ReEmailId"));
			NewPassword.clear();
			NewPassword.sendKeys(datamap.get(index).get("Password"));
			Select SMonth = new Select(Month);
			SMonth.selectByVisibleText("Feb");
			Select SDay = new Select(Day);
			SDay.selectByIndex(12);
			Select SYear = new Select(Year);
			SYear.selectByIndex(5);
			Female.click();
			try {
				Thread.sleep(3000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			CreateAcct.click();
		//	String Actual = ErrorMsg.getText();
	//	Assert.assertEquals(datamap.get(index).get("ExpectedResult"), Actual);	
		}	
	
	}
	




