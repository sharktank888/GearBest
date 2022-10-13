package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class CartPage {

	public void GearBestforBanu() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// Banu's
	//*[contains(@data-goods-id,'105077334737303438')]
	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div[1]/div/div[2]/ul/li[1]/a/img")
	public WebElement lenovoSpeaker;

	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div[2]/div[1]/div[2]/div[5]/a")
	public WebElement addToCartButton;

	@FindBy(xpath = "//*[@class='cart_price']")
	public WebElement price;
	
	@FindBy(xpath = "//*[text()='Cart']")
	public WebElement cart;

	@FindBy(xpath = "//*[@id='siteWrap']/div/div/div[1]/div/div[2]/div[1]/div[2]/div/div/div[3]/div/div/i[1]")
	public WebElement subtractFromCart;

	@FindBy(xpath = "//*[@id='siteWrap']/div/div/div[1]/div/div[2]/div[1]/div[2]/div/div/div[3]/div/div/i[2]")
	public WebElement addMoreToCart;

}