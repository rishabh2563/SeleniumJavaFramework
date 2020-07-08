package com.practice.scripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.test.BaseClass;
import com.practice.generics.BaseLib;
import com.practice.pageobjects.LetsTalkPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class LetsTalkFormTest extends BaseLib
{
	
	
	
	@BeforeMethod
	public void setup() 
	{
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("http://www.practiceselenium.com");
	}

	
	
	@Test(priority = 1, description = "Verifying Form Is Being Submitted Or Not")
	@Description("Verifying LetsTalkTea Module")
	@Severity(SeverityLevel.BLOCKER)
	@Story("StoryName: To Check whether Form is Submitting Or Not")
	public void LttformTest() 
	{
		LetsTalkPage ltp = new LetsTalkPage(driver);
		ltp.getLttBtn();
		ltp.getNametxtbx("Rishabh");
		ltp.getEmailtxtbx("rishabh.tripathifleekitsolutin@gmail.com");
		ltp.getSubtxtbx("Regarding Order");
		ltp.getMsgtxtbx("when i clicking on the order button the page is not redirecting to payment page");
		ltp.getMorelnk();
		ltp.getWelcmBtn();
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
