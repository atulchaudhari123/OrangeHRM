package com.orange.test;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.orange.pages.LoginPage;
import com.orange.testbase.TestBase;

public class LoginPageTest extends TestBase {

	LoginPage loginpage;
	public Logger logs;

	public LoginPageTest() throws Exception {
		super();
	}

	@BeforeMethod
	public void setUp() throws Exception {
		initialization();
		loginpage = new LoginPage();
		logs = Logger.getLogger("devpinoyLogger");
		logs.debug("Testing Orange HRM Application");
	}

	@Test(priority = 1)
	public void logoTest() {
		boolean b = loginpage.verifyLogo();
		Assert.assertTrue(b);
		logs.debug("Orange HRM Logo is available on Login page " +b);
	}

	@Test(priority = 2)
	public void pageTitleTest() {
		String title = loginpage.verifyTitle();
		String expTitle = "OrangeHRM";
		Assert.assertEquals(title, expTitle);
		logs.debug("Login page title is "+title);
	}

	@Test(priority = 3)
	public void forgotPWDTest() {
		loginpage.navigateForgotPwdPage();
		logs.debug("User navigates to forgot password page");
	}

	@Test(priority = 4)
	public void orgHRMTest() {
		loginpage.navigateOrgHRMPage();
	}

	@Test(priority = 5)
	public void loginTest() {
		loginpage.loginOrgHRM();
	}
    @AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
