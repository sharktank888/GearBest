package testCases.submission;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.PageInitialiser;

public class Aiming extends PageInitialiser {

	Actions actions;

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

	@Test(priority = 3)
	public void cl2_99() {
		actions = new Actions(Base.getDriver());
		actions.moveToElement(hp.activeSlide).build().perform();;
		Assert.assertTrue(hp.sliderNext.isDisplayed() && hp.sliderPrev.isDisplayed());
		Assert.assertEquals(hp.sliders.size(), hp.sliderDots.size());
		Integer sliderIndex;
		Integer sliderDotIndex;
		for (int i = 0; i < hp.sliders.size(); i++) {
			sliderIndex = Integer.parseInt(hp.sliders.get(i).getAttribute("data-slick-index"));
			sliderDotIndex = Integer.parseInt(hp.sliderDots.get(i).getAttribute("data-key"));
			Assert.assertEquals(sliderIndex, sliderDotIndex);
		}
	}

	@Test(priority = 4)
	public void cl2_100() {
		hp.clickCategory("Consumer Electronics");
		cep.clickSortBy("Rating");
		Double ratingA;
		Double ratingB;
		for (int i = 0; i < cep.ratings.size() -1; i++) {
			ratingA = Double.parseDouble(cep.ratings.get(i).getText());
			ratingB = Double.parseDouble(cep.ratings.get(i+1).getText());
			Assert.assertTrue(ratingA <= ratingB);
		}
	}

}
