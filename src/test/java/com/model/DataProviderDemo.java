package com.model;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@DataProvider
	public Object[][] dataTable(){
		Object[][] table = new Object[3][2];
		
		table[0][0] = "username1";
		table[0][1] = "password1";
		
		table[1][0] = "username2";
		table[1][1] = "password2";
		
		table[2][0] = "username3";
		table[2][1] = "password3";
		
		return table;
	}

	@DataProvider
	public Object[][] dataTable1(){
		return new Object[][]  {{"user1","pass1"},{"user2","pass2"}};
	}
	
}
