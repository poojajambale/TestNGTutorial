package com.model;

import org.testng.annotations.Test;

public class DataProviderMain {
	
	@Test(dataProvider = "dataTable", dataProviderClass = DataProviderDemo.class)
	public void test(String username, String password) {
		System.out.println(username+"=="+password);
	}
	
	@Test(dataProvider = "dataTable1", dataProviderClass = DataProviderDemo.class)
	public void test1(String username, String password) {
		System.out.println(username+"=="+password);
	}
}
