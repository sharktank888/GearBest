package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Nicky extends PageInitialiser {

	@Test(priority = 1)
	public void cl2_71() {
		hp.signInTab.click();
		hp.signInButton.click();
		sip.email.sendKeys(Base.getProperty("EMAIL"));
		sip.signInButton.click();
		String actual = sip.errorPassMsg.getText();
		String expected = Base.getProperty("errorMsg");
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 2)
	public void cl2_74() {
		hp.APPOnlyButton.click();
		aop.APPOnlyPage.getLocation();
		aop.newestButton.click();
		aop.newestPage.getLocation();
	}

}