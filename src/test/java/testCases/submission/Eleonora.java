package testCases.submission;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.PageInitialiser;

public class Eleonora extends PageInitialiser {

	@Test(priority = 1)
	public void cl2_127() {
		hp.clickTab("SUPER DEALS");
		sdp.clickSortBy("Price");
		Double currPrice;
		Double nextPrice;
		for (int i = 0; i < sdp.productPrice.size() - 1; i++) {
			currPrice = Double.parseDouble(sdp.productPrice.get(i).getText().substring(1));
			nextPrice = Double.parseDouble(sdp.productPrice.get(i + 1).getText().substring(1));
			Assert.assertTrue(currPrice <= nextPrice);
		}
	}

	@Test(priority = 2)
	public void cl2_128() {
		hp.clickTab("SUPER DEALS");
		Double rrpPrice;
		Double salePrice;
		for (int i = 0; i < sdp.productPrice.size(); i++) {
			rrpPrice = Double.parseDouble(sdp.productRrpPrice.get(i).getText().substring(1));
			salePrice = Double.parseDouble(sdp.productPrice.get(i).getText().substring(1));
			Assert.assertTrue(rrpPrice > salePrice);
		}
	}

}
