package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Common;
import utilities.PageInitialiser;

public class Banu extends PageInitialiser {

	@Test(enabled = false)
	public void cl2_40() {
		hp.clickCategory("Consumer Electronics");
		Common.jsClick(CP.lenovoSpeaker);
		CP.addToCartButton.click();
		CP.cart.click();
		Double price = Double.parseDouble(CP.price.getText());
		Assert.assertEquals(price, 36.90);
	}

	@Test(enabled = false)
	public void addorSubtractFromCart() {
		hp.clickCategory("Consumer Electronics");
		CP.addMoreToCart.click();
		CP.subtractFromCart.click();
	}

}