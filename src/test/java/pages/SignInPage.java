package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class SignInPage {

	public SignInPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	// dolkun's
	@FindBy(xpath = "//a[@class='authTab_link']")
	public WebElement registerTab;

	
	// Nicky's
	@FindBy(xpath = "//*[@id=\"js-panelUserInfo\"]")
	public WebElement moveCursor;

	@FindBy(xpath = "//*[@id='js-formLogin']/div[2]/p")
	public WebElement errorPassMsg;

	
	// Stas's
	@FindBy(name = "email")
	public WebElement email;

	@FindBy(xpath = "//*[@id='password']")
	public WebElement password;

	@FindBy(xpath = "//*[@id='js-btnSubmit']")
	public WebElement signInButton;

	@FindBy(xpath = "//*[@id='ucenter_content']/div/div[2]/ul/li/p[1]")
	public WebElement accountPage;

}
