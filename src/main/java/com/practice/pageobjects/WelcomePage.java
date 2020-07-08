package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class WelcomePage extends BasePage {

	@FindBy(xpath = "(//span[text()='See Collection'])[2]")
	private WebElement HtCollection;

	@FindBy(xpath = "(//span[text()='See Collection'])[3]")
	private WebElement LtCollection;

	@FindBy(xpath = "(//span[text()='See Collection'])[3]")
	private WebElement FtCollection;

	public WelcomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
@Step("HerbalTeaCollection Link Click")
	public void getHtCollection() {
		 HtCollection.click();
	}
@Step("LooseTeaCollection Link Click")
	public void getLtCollection() {
		 LtCollection.click();
	}
@Step("FlavouredTeaCollection Link Click")
	public void getFtCollection() {
		 FtCollection.click();
	}

}
