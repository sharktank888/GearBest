package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class TechBro extends PageInitialiser {

	@Test(priority = 1)
	public void GearBestWebsiteTestSignInValidUserName_ValidPassword_122() {
		hp.signInTab.click();
		hp.signInButton.click();
		sip.email.sendKeys(Base.getProperty("username"));
		sip.password.sendKeys(Base.getProperty("password"));
		sip.signInButton.click();;
		String actualTitle = Base.getDriver().getTitle();
		String expectedTitle = "Sign In";
		Assert.assertTrue(actualTitle.contains(expectedTitle));
	}

	@Test(priority = 2)
	public void GearBestRegistrationPage_123() {
		hp.signInTab.click();
		hp.signInButton.click();
		sip.registerTab.click();;
		boolean registerButtonDisplayed = rp.isRegisterButtonDisplayed();
		Assert.assertTrue(registerButtonDisplayed);
	}

}
