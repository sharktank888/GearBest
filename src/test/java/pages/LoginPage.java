package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// nuntaporn's
	@FindBy(xpath = "//*[@id=\"js-formLogin\"]/div[1]/p")
	public WebElement invalidEmailErrorMsg;

	
	// Kaned's
	@FindBy(name = "email")
	public WebElement userInput;

	@FindBy(name = "passWord")
	public WebElement passInput;

	@FindBy(id = "js-btnSubmit")
	public WebElement signInButtonClick;

}
