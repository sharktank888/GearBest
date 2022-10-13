package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class ConsumerElectronicsPage {
	
	public ConsumerElectronicsPage() {
		PageFactory.initElements(Base.getDriver(), this);
	}
	
	@FindBy(xpath = "//*[contains(@class,'sortItemBox')]/a")
	public List<WebElement> sortBy;
	
	public void clickSortBy(String name) {
		for (WebElement each : sortBy) {
			if (each.getText().contains(name)) {
				each.click();
				break;
			}
		}
	}
	
	@FindBy(xpath = "//*[contains(@class,'gbStarGrade_count')]")
	public List<WebElement> ratings;
	
}
