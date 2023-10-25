package com.model1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteTest {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Running before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Running after suite");
	}
	
}
