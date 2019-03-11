package com.dxc.unsecureAvba.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dxc.unsecureAvba.webdriver.InitChromeDriver;

public class LoginPage extends InitChromeDriver{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="lccBadgeNumber")
	private WebElement loginAAIDTextBox;
	
	public void setloginAAID(String loginAAID) {
		loginAAIDTextBox.sendKeys(loginAAID);
	}
	
	public void clearloginAAID() {
		loginAAIDTextBox.clear();
	}
	
	public void clickloginAAID() {
		loginAAIDTextBox.click();
	}
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement logInButton;
	
	public void clicklogInButton() {
		logInButton.click();
	}		
	
}
