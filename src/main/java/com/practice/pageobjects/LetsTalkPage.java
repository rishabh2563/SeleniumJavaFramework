package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class LetsTalkPage extends BasePage
{
	
	@FindBy(name="name")
	private WebElement nametxtbx;
	
	@FindBy(name="email")
	private WebElement emailtxtbx;
	
	@FindBy(name="subject")
	private WebElement subtxtbx;
	
	@FindBy(name="message")
	private WebElement msgtxtbx;
	
	@FindBy(xpath="//input[@class='form-submit']")
	private WebElement sbmitbtn;
	
	@FindBy(xpath="//span[@class='editor_sidebarmore']/ancestor::div[@id='wsb-element-00000000-0000-0000-0000-000450914883']")
	private WebElement morelnk;
	
	public LetsTalkPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
@Step("Entering Name: {0}")
	public void getNametxtbx(String name) {
	 nametxtbx.sendKeys(name);
	}
@Step("Entering Email: {0}")
	public void getEmailtxtbx(String email) {
		 emailtxtbx.sendKeys(email);
	}
@Step("Entering Subject: {0}")
	public void getSubtxtbx(String subject) {
		subtxtbx.sendKeys(subject);
	}
@Step("Entering Msg: {0}")
	public void getMsgtxtbx(String msg) {
		 msgtxtbx.sendKeys(msg);
	}
@Step("Clicking SubmitButton")
	public void getSbmitbtn() {
		 sbmitbtn.click();
	}
@Step("Clicking MoreLink")
	public void getMorelnk() {
		 morelnk.click();
	}

	
}
