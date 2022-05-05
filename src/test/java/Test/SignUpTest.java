package Test;



import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.SignUpPage;
import POM.ZerodhaLogin;
import Pojo.Browser;

public class SignUpTest {
	WebDriver driver;
	@BeforeMethod
	public void launchBrowser() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com");
	}
@Test
public void signUpTest() {
	ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);
	zerodhalogin.clickOnsignup();
	ArrayList<String> list=new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(list.get(1));
	SignUpPage signuppage=new SignUpPage(driver);
	String actualTitle =signuppage.getPageTitle(driver);
	String expectedTitle="Signup and open a Zerodha trading and demat account online and start investing - Zerodha";

//	Assert.assertEquals(actualTitle, expectedTitle);//hard assertion will stop execution at this point
//	Assert.assertTrue(signuppage.logoIsDisplayed());
//	signuppage.enterMobilenumber("8698394936");
//
	SoftAssert softassert= new SoftAssert();
	softassert.assertEquals(actualTitle,expectedTitle);
	softassert.assertTrue(signuppage.logoIsDisplayed());
	signuppage.enterMobilenumber("8698394946");
	softassert.assertAll();
	
}

}


