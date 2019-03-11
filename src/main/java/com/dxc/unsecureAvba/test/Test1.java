package com.dxc.unsecureAvba.test;

import org.testng.annotations.Test;


import com.dxc.unsecureAvba.webdriver.InitChromeDriver;

public class Test1 extends InitChromeDriver {

	@Test
	public void loginAdmin() throws InterruptedException {
		loginPage.clearloginAAID();
		Thread.sleep(3000);
		loginPage.setloginAAID("95746");
		Thread.sleep(3000);
		loginPage.clicklogInButton();
		Thread.sleep(3000);
	}
	
	

}
