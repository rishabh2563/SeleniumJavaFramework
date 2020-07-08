package com.practice.generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	
	public static WebDriver launchbrowser(String browsername) 
	{
		WebDriver driver=null;
		if (browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Exefile/chromedriver.exe");
			driver=new ChromeDriver();
		}
		return driver;
	}
	
}
