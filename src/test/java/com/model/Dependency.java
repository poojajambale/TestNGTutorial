package com.model;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
	
	@Test
	public void test1() {
		System.out.println("Test1");
		Assert.assertTrue(false);
	}

	@Test(dependsOnMethods = "test1",alwaysRun = true)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Test3");
	}

	@Test
	public void test4() {
		System.out.println("Test4");
	}
}
