package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public abstract class BasePage {
	
	@FindBy(xpath="//a[text()='Welcome']")
	private WebElement WelcmBtn;
	
	@FindBy(xpath="//a[text()='Menu']")
	private WebElement MenuBtn;
	
	@FindBy(xpath="//a[text()='Our Passion']")
	private WebElement OurPassionBtn;
	

	@FindBy(xpath="//a[contains(@href,'let-s')]")
	private WebElement LttBtn;
	
	
	@FindBy(xpath="//a[text()='Check Out']")
	private WebElement ChkOutBtn;
	
	public BasePage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
@Step("WelcomeBtn click")
	public void getWelcmBtn() {
		WelcmBtn.click();
		
	}
@Step("MenuBtn click")
	public void getMenuBtn() {
		 MenuBtn.click();
		
	}
@Step("PassionBtn click")
	public void getOurPassionBtn() {
		 OurPassionBtn.click();
	}
@Step("LetsTalkTea Btn click")
	public void getLttBtn() {
		 LttBtn.click();
	}
@Step("CheckoutBtn click")
	public void getChkOutBtn() {
		 ChkOutBtn.click();
	}
	

	
}
