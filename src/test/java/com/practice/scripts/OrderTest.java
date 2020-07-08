package com.practice.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.test.BaseClass;
import com.practice.generics.BaseLib;
import com.practice.pageobjects.CheckOutPage;
import com.practice.pageobjects.LetsTalkPage;
import com.practice.pageobjects.MenuPage;
import com.practice.pageobjects.WelcomePage;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class OrderTest extends BaseLib {
	
	
	public CheckOutPage cp;
	public MenuPage mp;
	public WelcomePage wp;
		
	
	public  WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("http://www.practiceselenium.com/");
	}
	
	
	@Test(priority=1,description="verifying order is placed or not")
	@Description("verify order module")
	@Severity(SeverityLevel.BLOCKER)
	@Story("StoryName: to check order being placed or not")
	public void Order() {
		
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

		mp.getRedTeaBtn().click();
		cp.getEmailTxtBx("rishabh.tripathifleekitsolutin@gmail.com");
		cp.getNameTxtBx("Rishabh");
		cp.getAdrsTxtBx("Noida Sector-12");
		Select sel1 = new Select(cp.getCardDrpDwn());
		sel1.selectByIndex(1);
		cp.getCardNoTxtBx("981012752709");
		cp.getCardholderNameTxtBx("Rishabh");
		cp.getVCTxtBx("123654");
		cp.getOrderBtn();
		System.out.println("RedTea Script Executed Successfully");

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

		LetsTalkPage ltp = new LetsTalkPage(driver);
		ltp.getLttBtn();
		ltp.getNametxtbx("Rishabh");
		ltp.getEmailtxtbx("rishabh.tripathifleekitsolutin@gmail.com");
		ltp.getSubtxtbx("Regarding Order");
		ltp.getMsgtxtbx("when i clicking on the order button the page is not redirecting to payment page");
		ltp.getMorelnk();
		ltp.getWelcmBtn();

		WelcomePage wp = new WelcomePage(driver);
		wp.getHtCollection();
		wp.getWelcmBtn();
		wp.getFtCollection();
		wp.getWelcmBtn();
		wp.getLtCollection();
		wp.getWelcmBtn();
		
		//checking order directly in the checkout page
		cp.getChkOutBtn();
		cp.getEmailTxtBx("rishabh.tripathifleekitsolutin@gmail.com");
		cp.getNameTxtBx("Rishabh");
		cp.getAdrsTxtBx("Noida Sector-12");
		Select cel = new Select(cp.getCardDrpDwn());
		cel.selectByIndex(1);
		cp.getCardNoTxtBx("981012752709");
		cp.getCardholderNameTxtBx("Rishabh");
		cp.getVCTxtBx("123654");
		cp.getOrderBtn();
		System.out.println("Checkout Order Script Executed Successfully");	
	
	}
	@Test(priority=2,description="verifying order doesn't get placed")
	@Description("verify order module")
	@Severity(SeverityLevel.BLOCKER)
	@Story("StoryName: to check if order getting placed with invalid credentials")
	public void InvalidOrder() 
	{
		MenuPage mp = new MenuPage(driver);
		mp.getMenuBtn();
		mp.getGreenTeaBtn().click();

		CheckOutPage cp = new CheckOutPage(driver);
		cp.getEmailTxtBx(" ");
		cp.getNameTxtBx("");
		cp.getAdrsTxtBx("");
		Select sel = new Select(cp.getCardDrpDwn());
		sel.selectByIndex(1);
		cp.getCardNoTxtBx("");
		cp.getCardholderNameTxtBx("");
		cp.getVCTxtBx("");
		cp.getOrderBtn();
		System.out.println("Invalid GreenTea Script Executed Successfully");

		mp.getRedTeaBtn().click();
		cp.getEmailTxtBx("");
		cp.getNameTxtBx("");
		cp.getAdrsTxtBx("");
		Select sel1 = new Select(cp.getCardDrpDwn());
		sel1.selectByIndex(1);
		cp.getCardNoTxtBx("");
		cp.getCardholderNameTxtBx("");
		cp.getVCTxtBx("");
		cp.getOrderBtn();
		System.out.println("Invalid RedTea Script Executed Successfully");

		mp.getOolongteaBtn().click();
		cp.getEmailTxtBx("");
		cp.getNameTxtBx("");
		cp.getAdrsTxtBx("");
		Select sel2 = new Select(cp.getCardDrpDwn());
		sel2.selectByIndex(1);
		cp.getCardNoTxtBx("");
		cp.getCardholderNameTxtBx("");
		cp.getVCTxtBx("");
		cp.getOrderBtn();
		System.out.println("Invalid  Script Executed Successfully");

		LetsTalkPage ltp = new LetsTalkPage(driver);
		ltp.getLttBtn();
		ltp.getNametxtbx("");
		ltp.getEmailtxtbx("");
		ltp.getSubtxtbx("");
		ltp.getMsgtxtbx("");
		ltp.getMorelnk();
		ltp.getWelcmBtn();

		WelcomePage wp = new WelcomePage(driver);
		wp.getHtCollection();
		wp.getWelcmBtn();
		wp.getFtCollection();
		wp.getWelcmBtn();
		wp.getLtCollection();
		wp.getWelcmBtn();
		System.out.println("Successfully executed the Invalid Order Script");
		
	}
	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}


}
