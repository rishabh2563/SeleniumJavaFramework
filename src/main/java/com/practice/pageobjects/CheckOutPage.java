package com.practice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class CheckOutPage extends BasePage
{

@FindBy(id="email")
private WebElement EmailTxtBx;

@FindBy(id="name")
private WebElement NameTxtBx;

@FindBy(id="address")
private WebElement AdrsTxtBx;

@FindBy(xpath="//select[@id='card_type']")
private WebElement CardDrpDwn;

@FindBy(id="card_number")
private WebElement CardNoTxtBx;

@FindBy(id="cardholder_name")
private WebElement CardholderNameTxtBx;

@FindBy(id="verification_code")
private WebElement VCTxtBx;

@FindBy(xpath="//button[@class='btn btn-primary']")
private WebElement OrderBtn;

public CheckOutPage(WebDriver driver) 
{
	super(driver);
	PageFactory.initElements(driver, this);

}

@Step("Entering Email:{0}")
public void getEmailTxtBx(String email) {
	 EmailTxtBx.sendKeys(email);
}
@Step("Entering Username:{0}")
public void  getNameTxtBx(String name) {
	 NameTxtBx.sendKeys(name);
}
@Step("Entering Address:{0}")
public void getAdrsTxtBx(String address) {
	 AdrsTxtBx.sendKeys(address);
}
@Step("Selecting the Type of Card")
public WebElement getCardDrpDwn() {
	return CardDrpDwn;
}
@Step("Entering the CardNo:{0}")
public void getCardNoTxtBx(String cardno) {
	 CardNoTxtBx.sendKeys(cardno);
}
@Step("Entering Cardholdername:{0}")
public void getCardholderNameTxtBx(String name) {
   CardholderNameTxtBx.sendKeys(name);
}
@Step("Entering VerificationCode:{0}")
public void getVCTxtBx(String verificationcode) {
	 VCTxtBx.sendKeys(verificationcode);
}
@Step("Clicking OrderButton")
public void getOrderBtn() {
	 OrderBtn.click();
}
   



	}

