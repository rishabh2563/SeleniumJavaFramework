package com.practice.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.nopcommerce.test.BaseClass;
import com.practice.generics.AllureTestListenerOrder;
import com.practice.generics.BaseLib;
import com.practice.pageobjects.CheckOutPage;
import com.practice.pageobjects.MenuPage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners({AllureTestListenerOrder.class})
public class GreenTeaOrderTest extends BaseLib {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		BaseClass bs = new BaseClass();
		driver = bs.initialize_driver();
		driver.get("http://www.practiceselenium.com/");
	}

	@Test(priority = 1, description = "Verifying GreenTea order is placed or not")
	@Description("Verifying order module")
	@Severity(SeverityLevel.BLOCKER)
	@Story("StoryName: To Check Order Being Placed OR Not")
	public void GreenTeaOrder() {

		MenuPage mp = new MenuPage(driver);
		mp.getMenuBtn();
		mp.getGreenTeaBtn().click();

		CheckOutPage cp = new CheckOutPage(driver);
		cp.getEmailTxtBx("rishabh.tripathifleekitsolutin@gmail.com");
		cp.getNameTxtBx("Rishabh");
		cp.getAdrsTxtBx("Noida Sector-12");
		Select sel = new Select(cp.getCardDrpDwn());
		sel.selectByIndex(1);
		cp.getCardNoTxtBx("981012752709");
		cp.getCardholderNameTxtBx("Rishabh");
		cp.getVCTxtBx("123654");
		cp.getOrderBtn();
		System.out.println("GreenTea Script Executed Successfully");
		Assert.assertEquals(driver.getTitle(),"Check Out");

	}
	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}
}
