package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class MenFashionPage {
	
	public MenFashionPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id=\"siteWrap\"]/div[1]/div[1]/div/div[1]/div[2]/p/a[6]")
	public WebElement sortHigh;

}
