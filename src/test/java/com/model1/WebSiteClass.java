package com.model1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.model.Retry;

public class WebSiteClass extends BaseClass{
	
	@Test(retryAnalyzer = Retry.class)
	public void launchApp() {
		driver.get("https://www.selenium.dev/");
		Assert.assertTrue(false);
	}
	
}
