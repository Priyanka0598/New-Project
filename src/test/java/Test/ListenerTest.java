package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Utility.ScreenShot;

public class ListenerTest implements ITestListener {
	WebDriver driver;
public void onTeststart(ITestResult result) {
	System.out.println("Started "+result.getName());
}
public void onTestSuccess(ITestResult result) {
	try {
		ScreenShot.takeScreenshot(driver, result.getName());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("My test is successful"+ result.getName());
}

public void onTestSkipped(ITestResult result) {
	System.out.println("My test skipped"+result.getName());
}
}
