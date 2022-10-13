package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Kaned extends PageInitialiser {

	@Test(priority = 1)
	public void cl2_65() {
		hp.signInTab.click();;
		hp.signInButton.click();
		lp.userInput.sendKeys(Base.getProperty("Username"));
		lp.passInput.sendKeys(Base.getProperty("Password"));
		lp.signInButtonClick.click();
		String actualResult = lp.invalidEmailErrorMsg.getText();
		Assert.assertEquals(actualResult, "Please enter a valid email address");
	}

	@Test(priority = 2)
	public void cl2_67() {
		hp.selectCat("Consumer Electronics");
		cp.cateList("Trending");
		String acText = cp.actualText.getText();
		Assert.assertEquals(acText, "Trending");
	}

}
