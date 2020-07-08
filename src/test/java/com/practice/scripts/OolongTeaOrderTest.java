package com.practice.scripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.nopcommerce.test.BaseClass;
import com.practice.generics.BaseLib;
import com.practice.pageobjects.CheckOutPage;
import com.practice.pageobjects.MenuPage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class OolongTeaOrderTest extends BaseLib {

	public CheckOutPage cp;
	public MenuPage mp;

	@BeforeMethod
	public void setup() {
		BaseClass bs = new BaseClass();
		driver = bs.initialize_driver();
		driver.get("http://www.practiceselenium.com/");
	}

	@Test(priority = 1, description = "Verifying OolongTeaOrder Is Placed OR Not")
	@Description("Verify Order Module")
	@Severity(SeverityLevel.BLOCKER)
	@Story("StoryName: To Check Order Being Placed OR Not")
	public void Order() {
		mp = new MenuPage(driver);
		cp = new CheckOutPage(driver);
		mp.getOolongteaBtn().click();
		cp.getEmailTxtBx("rishabh.tripathifleekitsolutin@gmail.com");
		cp.getNameTxtBx("Rishabh");
		cp.getAdrsTxtBx("Noida Sector-12");
		Select sel2 = new Select(cp.getCardDrpDwn());
		sel2.selectByIndex(1);
		cp.getCardNoTxtBx("981012752709");
		cp.getCardholderNameTxtBx("Rishabh");
		cp.getVCTxtBx("123654");
		cp.getOrderBtn();
		System.out.println("OolongTea Script Executed Successfully");

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
