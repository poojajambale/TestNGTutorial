package com.model;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
	
	@Test(enabled=false)
	public void test1() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		throw new SkipException("Test2 Not Complete");
	}
	
	boolean value = true;
	@Test
	public void test3() {
		if(value==true) {
			System.out.println("Test3");
		}
		else{
			throw new SkipException("Test3 Not Complete");
		}
	}
}
