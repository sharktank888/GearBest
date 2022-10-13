package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class SuperDealsPage {
	
	public SuperDealsPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(@class,'sortByInfoName')]")
	public List<WebElement> sortBy;
	
	public void clickSortBy(String str) {
		for (WebElement sort : sortBy) {
			if (sort.getText().contains(str)) {
				sort.click();
				break;
			}
		}
	}
	
	@FindBy(xpath = "//*[contains(@class,'sellingGoodsList')]/li/div/div[3]/span[1]")
	public List<WebElement> productPrice;
	
	@FindBy(xpath = "//*[contains(@class,'sellingGoodsList')]/li/div/div[4]/del/del")
	public List<WebElement> productRrpPrice;
	
}
