package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Stas extends PageInitialiser {

	@Test(priority = 1, enabled = false)
	public void cl2_53() {

	}

	@Test(priority = 2)
	public void cl2_54() {
		hp.favoriteTab.click();
		sip.email.sendKeys(Base.getProperty("email"));
		sip.password.sendKeys(Base.getProperty("password"));
		sip.signInButton.click();
		fp.closePopUp.click();
		Assert.assertEquals(sip.accountPage.getText(), "You currently don't have any favorites.");
	}

}