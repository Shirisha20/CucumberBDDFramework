package com.qa.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.Util.TestBase;

import junit.framework.Assert;

public class LoginPage extends TestBase {
	
	//Page Factory - OR:
		@FindBy(xpath = "//*[@id='email']")
		WebElement EmailId;
		
		@FindBy(xpath = "//*[@id='pass']")
		WebElement Password;
		
		@FindBy(xpath="//*[@id='loginbutton']")
		WebElement loginBtn;
		
		@FindBy(id="navItem_1792007875")
		WebElement UserName;
		
		@FindBy(xpath="//*[contains(@id, 'userNavigationLabel')]")
		WebElement TriangleBtn;
		
		@FindBy(xpath = "//a[contains(@data-gt,'menu_logout')]")
		WebElement LogOut;
		
		@FindBy(xpath = "//i[@class='fb_logo img sp_1Wg5e5zp_tr_1_5x sx_0f31f3']")
		WebElement ApplicationName;
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
		
		public void VerifyUserName(){
			String UserNameTitle = UserName.getText();
		    Assert.assertEquals("Shiri Madamraju", UserNameTitle);
		}
		
		public HomePage login(String EId, String Pwd){
		EmailId.sendKeys(EId);
		Password.sendKeys(Pwd);
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbutton")));
		 loginBtn.click();
		  	return new HomePage();
		}
		
	public boolean isEnabled() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();",TriangleBtn);
			return TriangleBtn.isDisplayed();
	
		}
		
		public void ClickTraingleBtn() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].click();", TriangleBtn);
			 WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement el = wait.until(ExpectedConditions.elementToBeClickable(TriangleBtn));
			el.click();
			
		}
		
		public void ClickLogout() {
			 //Wait for button appear
		    WebDriverWait wait = new WebDriverWait(driver,30);
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@data-gt,'menu_logout')]")));
		    //Click it by JS
		    JavascriptExecutor js = ((JavascriptExecutor)driver);
		   WebElement LogOut = driver.findElement(By.xpath("//a[contains(@data-gt,'menu_logout')]"));
		    js.executeScript("arguments[0].click();", LogOut);
			
		}
		
		public LoginPage VerifyApplicationName() {
			WebDriverWait wait = new WebDriverWait(driver,40);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='fb_logo img sp_1Wg5e5zp_tr_1_5x sx_0f31f3']")));
			String Text = ApplicationName.getText();
			Assert.assertEquals("Facebook", Text);
			return new LoginPage();
		}
	/*	public void CloseBrowser() {
			driver.quit();
		}*/
		
		
		

}
