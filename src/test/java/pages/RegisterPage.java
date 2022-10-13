package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;

public class RegisterPage {
    public RegisterPage(){
        PageFactory.initElements(Base.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='password']")
    private WebElement registerButton;

    public boolean isRegisterButtonDisplayed(){
        JavascriptExecutor js = (JavascriptExecutor) Base.getDriver();
        js.executeScript("window.scrollBy(0,300)");
       return registerButton.isDisplayed();
    }


}
