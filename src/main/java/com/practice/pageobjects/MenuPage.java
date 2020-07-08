package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class MenuPage extends BasePage
{
	
	@FindBy(xpath="(//a/span[@class='button-content wsb-button-content'])[2]")
	private WebElement GreenTeaBtn;
	
	@FindBy(xpath="(//a/span[@class='button-content wsb-button-content'])[1]")
	private WebElement RedTeaBtn;
	
	@FindBy(xpath="(//a/span[@class='button-content wsb-button-content'])[3]")
	private WebElement OolongteaBtn;
	
	public MenuPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
@Step("GreenTeaBtn Click")
	public WebElement getGreenTeaBtn() {
		return GreenTeaBtn;
	}
@Step("RedTeaBtn Click")
	public WebElement getRedTeaBtn() {
		return RedTeaBtn;
	}
@Step("OolongTea Click")
	public WebElement getOolongteaBtn() {
		return OolongteaBtn;
	}
	
	
	

}
