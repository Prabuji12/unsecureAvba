package com.dxc.unsecureAvba.test;

import org.testng.annotations.Test;

import com.dxc.unsecureAvba.constants.TestConstants;
import com.dxc.unsecureAvba.webdriver.InitChromeDriver;

public class Test1 extends InitChromeDriver {

	@Test
	public void loginAdmin() throws InterruptedException {
		faInfo.clearloginAAID();
		Thread.sleep(3000);
		faInfo.setloginAAID("95746");
		Thread.sleep(3000);
		faInfo.clicklogInButton();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = { "landAccrualPage" })
	public void configAccrualForLAA() throws InterruptedException {
		accrual.selectVacationYear("2019");
		Thread.sleep(3000);
		accrual.selectSingleWorkgroup("LAA");
		Thread.sleep(3000);
		accrual.clickAccrualHeader();
		Thread.sleep(10000);
		accrual.clickAddRowButton(1);
		Thread.sleep(3000);
		accrual.configRow(TestConstants.rowConfigLAA, 0);
		Thread.sleep(3000);
		accrual.clickSaveAccrualButton();
		Thread.sleep(3000);
		// accrual.clickDeleteAllButton();
	}

	@Test(dependsOnMethods = { "landAccrualPage" })
	public void configAccrualForLUS() throws InterruptedException {
		accrual.selectVacationYear("2019");
		Thread.sleep(3000);
		accrual.selectSingleWorkgroup("LUS");
		Thread.sleep(3000);
		accrual.clickAccrualHeader();
		Thread.sleep(10000);
		accrual.clickAddRowButton(1);
		Thread.sleep(3000);
		accrual.configRow(TestConstants.rowConfigLUS, 0);
		Thread.sleep(3000);
		accrual.clickSaveAccrualButton();
		Thread.sleep(3000);
		// accrual.clickDeleteAllButton();
	}
	
	@Test(dependsOnMethods = { "landAccrualPage" })
	public void deleteAccrualForLAA() throws InterruptedException {
		accrual.selectVacationYear("2019");
		Thread.sleep(3000);
		accrual.selectSingleWorkgroup("LAA");
		Thread.sleep(3000);
		accrual.clickAccrualHeader();
		Thread.sleep(10000);
		accrual.checkDeleteAllBox();
		Thread.sleep(3000);
		accrual.clickDeleteAllButton();
		Thread.sleep(3000);
		accrual.confirmDelete();
		Thread.sleep(3000);
	}

	@Test(dependsOnMethods = { "landAccrualPage" })
	public void deleteAccrualForLUS() throws InterruptedException {
		accrual.selectVacationYear("2019");
		Thread.sleep(3000);
		accrual.selectSingleWorkgroup("LUS");
		Thread.sleep(3000);
		accrual.clickAccrualHeader();
		Thread.sleep(10000);
		accrual.checkDeleteAllBox();
		Thread.sleep(3000);
		accrual.clickDeleteAllButton();
		Thread.sleep(3000);
		accrual.confirmDelete();
		Thread.sleep(3000);
	}


	@Test(dependsOnMethods = { "loginAdmin" })
	public void landAccrualPage() throws InterruptedException {
		annual_menulist.clickAnnualMenu();
		Thread.sleep(3000);
		annual_menulist.clickAccrualSubMenu();
		Thread.sleep(3000);
	}

}
