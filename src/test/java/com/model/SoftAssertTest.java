package com.model;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertTest {
	
	@Test
	public void verifyTitleTest() {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String expectedTitle = "Selenium";
		String actualTitle = driver.getTitle();
		String actualText = "_blank";
		String expectedText = driver.findElement(By.xpath("/html/body/div/main/div[1]/div/div/a")).getAttribute("target");
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(actualTitle, expectedTitle);
		softAssert.assertEquals(actualText, expectedText);
		
		driver.close();
		softAssert.assertAll();
	}
	
}
