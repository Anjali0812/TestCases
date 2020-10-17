package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.LoginPOM1;
import com.training.pom.LoginPOM2;
import com.training.pom.LoginPOM3;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private LoginPOM1 loginPOM1;
	private LoginPOM2 loginPOM2;
	private LoginPOM3 loginPOM3;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver);
		loginPOM1 =new LoginPOM1(driver);
		loginPOM2= new LoginPOM2(driver);
		loginPOM3= new LoginPOM3(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}


	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	/*
	 * @Test public void validLoginTest() { loginPOM.sendUserName("admin");
	 * loginPOM.sendPassword("admin@123"); loginPOM.clickLoginBtn();
	 * loginPOM.clickcustBtn(); loginPOM.clickcustomerBtn();
	 * screenShot.captureScreenShot("First"); }
	 */
	
	/*
	 * @Test public void enterRegistrationDetails() throws InterruptedException {
	 * loginPOM1.toclickBeforeRegister(); Thread.sleep(2000);
	 * loginPOM1.toclickRegister(); Thread.sleep(2000);
	 * loginPOM1.sendFirstName("Anjali"); loginPOM1.sendLastName("Kumar");
	 * Thread.sleep(2000); loginPOM1.sendemail("kumar123@gmail.com");
	 * loginPOM1.sendphnno("9241835892"); Thread.sleep(1000); Actions act=new
	 * Actions(driver); act.sendKeys(Keys.PAGE_DOWN).build().perform();
	 * Thread.sleep(2000); loginPOM1.sendadd1("Jayanagar");
	 * loginPOM1.sendcity("Bangalore"); Thread.sleep(1000);
	 * loginPOM1.sendPostCode("560082"); loginPOM1.selectCountry(106);
	 * loginPOM1.selectState(15); loginPOM1.setPassword("anjy123");
	 * Thread.sleep(1000); loginPOM1.confirmPassword("anjy123");
	 * loginPOM1.newsLetter(); Thread.sleep(1000); loginPOM1.clickPolicy();
	 * loginPOM1.clickSubmit(); loginPOM1.clickMyAccount(); Thread.sleep(1000);
	 * loginPOM1.sendemail("kumar123@gmail.com"); Thread.sleep(1000);
	 * loginPOM1.setPassword("anjy123"); loginPOM1.clickLogin(); }
	 */
	
	/*
	 * @Test public void toBookTshirt() throws InterruptedException {
	 * loginPOM1.toclickBeforeRegister(); loginPOM2.clickLogin();
	 * loginPOM1.sendemail("kumar123@gmail.com"); Thread.sleep(1000);
	 * loginPOM1.setPassword("anjy123"); Thread.sleep(1000); loginPOM1.clickLogin();
	 * Thread.sleep(1000); loginPOM2.getUniform(); Thread.sleep(1000);
	 * loginPOM2.getTshirt(); loginPOM2.getSize(); loginPOM2.clickOnAddToCart();
	 * loginPOM2.clickCart(); Thread.sleep(1000); loginPOM2.clickViewCart();
	 * Thread.sleep(2000); loginPOM2.clickCheckout();
	 * 
	 * }
	 */
	
	@Test
	public void checkOut() throws InterruptedException {
		loginPOM1.toclickBeforeRegister();
		loginPOM2.clickLogin();
		loginPOM1.sendemail("kumar123@gmail.com");
		Thread.sleep(1000);
		loginPOM1.setPassword("anjy123");
		Thread.sleep(1000);
		loginPOM1.clickLogin();
		Thread.sleep(2000);
		loginPOM2.getUniform();
		Thread.sleep(3000);
		loginPOM3.clickAgainTshirt();
		Thread.sleep(1000);
		loginPOM2.getSize();
		loginPOM2.clickOnAddToCart();
		loginPOM2.clickCart();
		Thread.sleep(1000);
		loginPOM2.clickViewCart();
		Thread.sleep(3000);
		loginPOM2.clickCheckout();
		Thread.sleep(2000);
		loginPOM3.continueBilling();
		loginPOM3.continueDelivery();
		Thread.sleep(3000);
		loginPOM3.clickFreeShipping();
		loginPOM3.sendText("Please Deliver between 7am to 10 am");
		Thread.sleep(1000);
		loginPOM3.continueDeliveryMethod();
		Thread.sleep(1000);
		loginPOM1.clickPolicy();
		Thread.sleep(2000);
		loginPOM3.clickFinalContinue();
	}

}
