package com.model1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenShot extends BaseClass{
	
	public void screenShot() throws IOException {
	File screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenShot, new File(".//ScreenShot/screenshot.png"));
	}
}
