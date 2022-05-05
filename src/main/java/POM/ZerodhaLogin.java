package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZerodhaLogin {
	@FindBy(xpath = "//input[@id='userid']") private WebElement name;
	//driver.findElement
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath="//button[@type='submit']") private WebElement submit;
	@FindBy(xpath="//input[@type='password']") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement pinsubmit;
	@FindBy(xpath="//a[@class='text-light']")private WebElement signup;


	public ZerodhaLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterUserName(String user) {
		name.sendKeys(user);
	}
	public void enterPassword(String Pass) {
		pass.sendKeys(Pass);
	}
	public void clickOnSubmit() {
		submit.click();
	}
	public void enterPin(String number,WebDriver driver) {
		WebDriverWait wait= new WebDriverWait(driver,5000) ;
		wait.until(ExpectedConditions.visibilityOf(pin));
		pin.sendKeys(number);
	}
	public void clickOnPin() {
		pinsubmit.click();
	}
public void clickOnsignup() {
	signup.click();
}



	}






