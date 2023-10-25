package com.model;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="smoke")
public class TestGroups {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Run after Class");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup() {
		System.out.println("Run before regression group");
	}
	
	@AfterGroups(value="regression")
	public void afterGroup() {
		System.out.println("Run after regression group");
	}
	
	@Test(groups={"regression","bvt"})
	public void test1() {
		System.out.println("Test1");
	}

	@Test(priority=1,groups="bvt")
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(groups="bvt")
	public void test3() {
		System.out.println("Test3");
	}

	@Test(groups="regression")
	public void test4() {
		System.out.println("Test4");
	}
}
