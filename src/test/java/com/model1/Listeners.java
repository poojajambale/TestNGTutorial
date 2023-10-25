package com.model1;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners extends ScreenShot implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is "+result.getName());
		System.out.println("Test case is started");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is "+result.getStatus());
		System.out.println("Result is displayed");
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("ScreenShot Captured");
		try {
			screenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}

}
