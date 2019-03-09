package com.dxc.unsecureAvba.webdriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;
import org.testng.annotations.*;

import com.dxc.ownmaven.support.SeleniumListener;
import com.dxc.unsecureAvba.constants.TestConstants;
import com.dxc.unsecureAvba.pom.Accrual;
import com.dxc.unsecureAvba.pom.AnnualMenuList;
import com.dxc.unsecureAvba.pom.FAInfo;

public class InitChromeDriver {

	protected WebDriver driver;
	protected EventFiringWebDriver event_driver;
	protected EventFiringMouse mouse_driver;
	protected Actions action;
	protected JavascriptExecutor js;
	protected SeleniumListener listen;
	protected Locatable locatable;
	protected Coordinates coordinate;
	protected FAInfo faInfo;
	protected AnnualMenuList annual_menulist;
	protected Accrual accrual;

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite");
		System.setProperty(TestConstants.systemProperty, TestConstants.driverPath);
		driver = new ChromeDriver();
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		listen = new SeleniumListener();
		event_driver = new EventFiringWebDriver(driver);
		mouse_driver = new EventFiringMouse(driver, listen);
		action = new Actions(driver);
		js = (JavascriptExecutor) driver;
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class");
		driver.manage().window().maximize();
		driver.get(TestConstants.unsecureAvba);
		faInfo = new FAInfo(driver);
		annual_menulist = new AnnualMenuList(driver);
		accrual = new Accrual(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}

	@BeforeGroups
	public void beforeGroups() {
		System.out.println("Before Groups");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("After Class");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}

	@AfterGroups
	public void afterGroups() {
		System.out.println("After Groups");
	}

}
