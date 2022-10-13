package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Base;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(Base.getDriver(), this);
	}

	@FindBy(xpath = "//*[contains(@class,'headNav')]/a")
	public List<WebElement> menuTab;

	public void clickTab(String tabName) {
		for (WebElement eachTab : menuTab) {
			if (eachTab.getText().contains(tabName)) {
				eachTab.click();
				break;
			}
		}
	}

	@FindBy(xpath = "//*[contains(@class,'headCate')]/li/a")
	public List<WebElement> category;

	public void clickCategory(String item) {
		for (WebElement each : category) {
			if (each.getText().contains(item)) {
				each.click();
				break;
			}
		}
	}

	@FindBy(xpath = "//*[contains(@class,'slick-track')]/div")
	public List<WebElement> sliders;

	@FindBy(xpath = "//*[contains(@class,'indexSlick_circles')]/div")
	public List<WebElement> sliderDots;

	@FindBy(xpath = "//*[contains(@class,'indexBanner_btnPrev')]")
	public WebElement sliderPrev;

	@FindBy(xpath = "//*[contains(@class,'indexBanner_btnNext')]")
	public WebElement sliderNext;

	@FindBy(xpath = "//*[contains(@class,'slick-active')]")
	public WebElement activeSlide;

	
	// Nuntaporn's
	@FindBy(xpath = "//*[@id='js-panelUserInfo']/span[2]")
	public WebElement signInTab;

	@FindBy(xpath = "//*[@id='js-panelUserInfo']/a ")
	public WebElement AccountName;

	
	// Nelson's
	@FindBy(xpath = "//*[@class='headUser_login']/a")
	public WebElement loginButton;

	@FindBy(xpath = "//*[@class='headNav_cateLabel']")
	public WebElement categoryButton;

	@FindBy(xpath = "//*[@class='headCate_item'][12]/a/span")
	public WebElement mensFashion;

	@FindBy(xpath = "//*[@class='userInfo_myTicket_unread']/a")
	public WebElement ticketList;

	@FindBy(xpath = "//*[@class='icon_google']")
	public WebElement googleLogin;

	@FindBy(xpath = "//*[@class='headUser_btnLogin']")
	public WebElement clickSignin;

	@FindBy(xpath = "//*[@class='headUser_name js-labelUserName']")
	public WebElement signInClick;

	@FindBy(xpath = "//*[@class='guide-mark-cancel js-guide-mark-cancel']")
	public WebElement cancelButton;

	@FindBy(xpath = "//*[@class='userInfo_myTicket_unread']/a")
	public WebElement ticketButton;

	
	// Kaned's
	@FindBy(xpath = "//div[@id='js-panelUserInfo']/div/div/div/a[1]")
	public WebElement signInButton;

	@FindBy(xpath = "//*[contains(@class,'headCate_item')]/a")
	public List<WebElement> catTab;

	public void selectCat(String cateName) {
		for (WebElement eachCat : catTab) {
			if (eachCat.getText().contains(cateName)) {
				eachCat.click();
				break;
			}
		}
	}

	
	// Nicky's
    @FindBy(xpath = "/html/body/div[1]/div[2]/ul[2]/li[3]/a")
	public WebElement APPOnlyButton;
    
    
	// Stas's
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/a")
	public WebElement favoriteTab;

	@FindBy(xpath = "//*[@id=\"siteWrap\"]/div[2]")
 	public WebElement signInPage;

}
