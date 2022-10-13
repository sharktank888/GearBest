package testCases.submission;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Nuntaporn extends PageInitialiser {

	@Test(priority=1)
	public void cl2_24() {
		hp.signInTab.click();
		hp.signInButton.click();
		lp.userInput.sendKeys(Base.getProperty("InvalidEmail"));
		lp.passInput.sendKeys(Base.getProperty("InvalidPassword"), Keys.ENTER);
		lp.signInButtonClick.click();
		String popupReport = lp.invalidEmailErrorMsg.getText();
		String expectPopUp = Base.getProperty("expectPopup");
		Assert.assertEquals(popupReport, expectPopUp);
	}

	@Test(priority=2)
	public void cl2_34() {
		hp.signInTab.click();
		hp.signInButton.click();
		lp.userInput.sendKeys(Base.getProperty("EmailSignIn"), Keys.TAB);
		lp.passInput.sendKeys(Base.getProperty("PasswordSignIn"), Keys.TAB);
		lp.signInButtonClick.click();
		String actualResult = hp.AccountName.getText();
		String expectresult = Base.getProperty("expect");
		Assert.assertEquals(actualResult, expectresult);
	}

}
