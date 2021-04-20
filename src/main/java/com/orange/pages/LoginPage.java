package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.testbase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement pwd;

	@FindBy(id = "btnLogin")
	WebElement loginBtn;

	@FindBy(xpath = "//div[@id='divLogo']//img")
	WebElement OrgHRMLogo;

	@FindBy(xpath = "//a[text()='Forgot your password?']")
	WebElement ForgotPwdLink;

	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	WebElement OrgHRMLink;

	public LoginPage() throws Exception {
		PageFactory.initElements(driver, this);

	}

	public boolean verifyLogo() {
		return OrgHRMLogo.isDisplayed();
	}

	public String verifyTitle() {
		return driver.getTitle();
	}

	public void navigateForgotPwdPage() {
		ForgotPwdLink.click();
	}

	public void navigateOrgHRMPage() {
		OrgHRMLink.click();
	}

	public void loginOrgHRM() {
		uname.sendKeys("admin");
		pwd.sendKeys("admin123");
		loginBtn.click();

	}
}
