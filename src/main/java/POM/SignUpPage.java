package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
@FindBy(xpath="//a[@class='text-light']")private WebElement sign;
@FindBy(xpath="//input[@id='user_mobile']") private WebElement mobileNumber;
@FindBy(xpath="//img[@class=\'logo-img\']") private WebElement logo;

public SignUpPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
public String getPageTitle(WebDriver driver) {
	return driver.getTitle();
	}
public boolean logoIsDisplayed() {
	return logo.isDisplayed();
}
public void enterMobilenumber(String number) {
  mobileNumber.sendKeys(number);
}
public void clickOnSign() {
	sign.click();
}
}
