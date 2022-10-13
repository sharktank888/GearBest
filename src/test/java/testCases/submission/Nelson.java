package testCases.submission;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Nelson extends PageInitialiser {

	@Test
	public void cl2_59() {
		hp.signInTab.click();
		hp.loginButton.click();
		lp.userInput.sendKeys(Base.getProperty("email"));
		lp.passInput.sendKeys(Base.getProperty("password"));
		lp.signInButtonClick.click();
		hp.categoryButton.click();
		hp.mensFashion.click();
		mfp.sortHigh.click();
	}

	@Test
	public void cl2_110() {
		hp.signInTab.click();
		hp.loginButton.click();
		lp.userInput.sendKeys(Base.getProperty("EmailSignIn"));
		lp.passInput.sendKeys(Base.getProperty("PasswordSignIn"));
		lp.signInButtonClick.click();
		hp.signInClick.click();
		hp.cancelButton.click();
		hp.ticketButton.click();
		Set<String> ids = Base.getDriver().getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentID = it.next();
		String childId = it.next();
		Base.getDriver().switchTo().window(childId);
		tp.statusDropdown.click();
		String status = tp.dropdown.getText().trim();
	}
	
}
