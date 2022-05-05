package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import POM.ZerodhaLogin;
import Pojo.Browser;
import Utility.Excel;
//@Listeners(ListenerTest.class)


public class LoginTest {//extends BaseClassTest 
	//ExtentReports report;
	//ExtentTest test;
	WebDriver driver;

	@BeforeMethod
	public void CallBrowser() {
		driver = Browser.OpenBrowser("https://kite.zerodha.com");
	}
	@Test
	public void LoginWithCredentials() throws IOException, InterruptedException {
		//test = report.createTest("LoginWithCredentials");
		ZerodhaLogin zerodhalogin = new ZerodhaLogin(driver);
		String user=Excel.getTestData(0,1,"Credentials");
		zerodhalogin.enterUserName(user);
		String pass=Excel.getTestData(1,1,"Credentials");
		zerodhalogin.enterPassword(pass);
	
		zerodhalogin.clickOnSubmit();
		String pin=Excel.getTestData(2,1,"Credentials");
		Thread.sleep(2000);
		zerodhalogin.enterPin(pin,driver);
		
		zerodhalogin.clickOnPin();
		//Assert.assertTrue(false);

	}
//	@AfterMethod
//	public void catureResult(ITestResult result) {
//		if(result.getStatus()==ITestResult.FAILURE) {
//			test.log(Status.FAIL, result.getName());
//		}
//		else if(result.getStatus()==ITestResult.SUCCESS) {
//			test.log(Status.SKIP,result.getName());
//		}
//		
//	}
//	@AfterClass
//	public void flushResults() {
//		report.flush();
//	}

	
}
