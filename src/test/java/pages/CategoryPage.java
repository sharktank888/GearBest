package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class CategoryPage {
	
	public CategoryPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='siteWrap']/div[1]/div[1]/div/div[1]/div[3]/p/a[5]")
	public WebElement actualText;
	
	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div[1]/div/div[1]/div[3]/p/a")
	public List<WebElement> sort;
	
	public void cateList(String trends) {
		for (WebElement eachtab : sort) {
			if(eachtab.getText().contains(trends)) {
				eachtab.click();
				break;
			}
		}	
	}
	
}
