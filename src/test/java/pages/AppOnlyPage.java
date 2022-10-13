package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class AppOnlyPage {

	public AppOnlyPage() {

		PageFactory.initElements(Base.getDriver(), this);
	}

	@FindBy(xpath = "/html/body/div[1]/div[2]/ul[2]/li[3]/a")
	public WebElement APPOnlyButton;

	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div")
	public WebElement APPOnlyPage;

	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div/nav/a[2]")
	public WebElement newestButton;

	@FindBy(xpath = "//*[@id='siteWrap']/div[1]/div/div[2]")
	public WebElement newestPage;

}