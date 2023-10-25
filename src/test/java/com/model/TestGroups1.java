package com.model;

import org.testng.annotations.Test;

import com.model1.SuiteTest;

public class TestGroups1 extends SuiteTest{
	
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

