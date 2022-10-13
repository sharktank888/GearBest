package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class TicketsPage {
	
	public TicketsPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@class='chang_status']/option[2]")
	public WebElement statusDropdown;
	
	@FindBy(xpath="//*[@class='chang_status']")
	public WebElement dropdown;

}
