package com.nopcommerce.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;


@Listeners({AllureListener.class})
public class EcommerceTest extends BaseClass {
	
	public  WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		BaseClass bs= new BaseClass();
		driver = bs.initialize_driver();
		driver.get("https://www.nopcommerce.com");
	}
	
	@Test(priority=1,description="verifying login module")
	@Description("verify login module")
	@Epic("EP001")
	@Feature("Feature1:Login")
	@Story("verify login")
	@Step("Verify login")
	@Severity(SeverityLevel.BLOCKER)
	public void login() throws InterruptedException 
	{
		WebElement signin = driver.findElement(By.xpath("//a[@class='userlink']"));
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		Actions act=new Actions(driver);
		act.moveToElement(signin).perform();
		act.click().perform();
		act.moveToElement(login).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("rishabh2563");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("rishabh5");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(),"Free and open-source eCommerce platform. ASP.NET based shopping cart. - nopCommerce");
		WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
		Thread.sleep(2000);
		act.moveToElement(logout).click().perform();
	}
	@Test(priority=3,description="verify logo")
	@Description("verify logo")
	@Epic("EP002")
	@Feature("Feature2:Logo")
	@Story("verify logo")
	@Step("Verify logo")
	@Severity(SeverityLevel.BLOCKER)
	public void verifylogo() 
	{
		 boolean logoimg = driver.findElement(By.xpath("//img[@title='nopCommerce']")).isDisplayed();
		 Assert.assertEquals(logoimg, true);
	}
	
	@Test(priority=2)
	@Description("verify registration")
	@Epic("EP003")
	@Feature("Feature3:Registration")
	@Story("verify registration")
	@Step("Verify registration")
	@Severity(SeverityLevel.NORMAL)
	public void registrationtest() throws InterruptedException 
	{
	//	WebElement logout = driver.findElement(By.xpath("//a[text()='Log out']"));
		//Thread.sleep(2000);
		Actions act=new Actions(driver);
		//act.moveToElement(logout).click().perform();
		WebElement signin = driver.findElement(By.xpath("//a[@class='userlink']"));
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		Thread.sleep(2000);
		act.moveToElement(signin).perform();
		act.click().perform();
		act.moveToElement(register).click().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("rishabh");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("tripathi");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("rt6377387231@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmEmail")).sendKeys("rt6377387231@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Username")).sendKeys("rishabh2563");
		WebElement CountryDrpdwn = driver.findElement(By.xpath("//select[@id='CountryId']"));
		WebElement CompanyDrpdwn = driver.findElement(By.xpath("//select[@id='CompanyRoleId']"));
		Select sel=new Select(CountryDrpdwn);
		sel.selectByVisibleText("India");
		Select sel1=new Select(CompanyDrpdwn);
		sel1.selectByIndex(1);
		WebElement TimezoneDrpdwn = driver.findElement(By.id("TimeZoneId"));
		Select tzd=new Select(TimezoneDrpdwn);
		tzd.selectByVisibleText("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Rishabh3");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Rishabh3");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(2000);
		WebElement ErrorMsg = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
		Assert.assertEquals(ErrorMsg, "The specified email already exists1");
	}

	@AfterMethod
	public void teardown() 
	{
		driver.close();
	}
}
