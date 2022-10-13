package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class FavouritesPage {

	public FavouritesPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/div[5]/div[2]/div[1]")
	public WebElement closePopUp;

}
