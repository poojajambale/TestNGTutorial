package com.model;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void loginToApplication() {
		System.out.println("Login To Application");
	}
	
	@AfterTest
	public void logoutFromApplication() {
		System.out.println("Logout From Application");
	}
	
/*	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
*/	
	@Test(description="This is test1")
	public void test1() {
		System.out.println("Test1");
	}

	@Test(priority=1,description="This is Test2")
	public void test2() {
		System.out.println("Test2");
	}
}
