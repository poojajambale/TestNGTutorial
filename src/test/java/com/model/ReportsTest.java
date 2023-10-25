package com.model;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTest {

	@Test
	public void reporterTest1() {
		Reporter.log("This is Test 1");
		System.out.println("This is Test 1");
	}
	
	@Test
	public void reporterTest2() {
		System.out.println("This is Test 2");
	}

	@Test
	public void reporterTest3() {
		System.out.println("This is Test 3");
	}

}
