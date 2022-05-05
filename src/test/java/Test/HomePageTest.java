package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;

public class HomePageTest {
WebDriver driver;
	
	@BeforeMethod
	public void launchbrowser() throws IOException, InterruptedException {
		driver=Browser.OpenBrowser("https://kite.zerodha.com");
		String username = Excel.getTestData(0, 1, "Credentials");
		String password =Excel.getTestData(1, 1, "Credentials");
		String pinnumber =Excel.getTestData(2, 1, "Credentials");
		
	ZerodhaLogin zerodhalogin =new ZerodhaLogin(driver);
	zerodhalogin.enterUserName(username);
	zerodhalogin.enterPassword(password);
	zerodhalogin.clickOnSubmit();
	Thread.sleep(2000);
	zerodhalogin.enterPin(pinnumber,driver);
	zerodhalogin.clickOnPin();
	}
	
@Test
	public void buyshare() throws InterruptedException  {
		HomePage buysh = new HomePage(driver);
		buysh.selectstockfromlist(driver, "TATAMOTORS");
		Thread.sleep(2000);
		buysh.clickonBuy();
	
	}
	
	@Test 
	public void Search()
	{
		HomePage Riya = new HomePage(driver);
		Riya.Searchpath(driver, "TARC");
	}
}
