package com.training.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM1 {
private WebDriver driver; 
	
	public LoginPOM1(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement toRegister;
	
	@FindBy(linkText="Register")
	private WebElement register;
	
	@FindBy(id="input-firstname")
	private WebElement firstName;
	
	@FindBy(id="input-lastname")
	private WebElement lastName;
	
	@FindBy(id="input-email")
	private WebElement email;
	
	@FindBy(id="input-telephone")
	private WebElement phnno;
	
	@FindBy(id="input-address-1")
	private WebElement add1;
	
	@FindBy(id="input-city")
	private WebElement city;
	
	@FindBy(id="input-postcode")
	private WebElement postCode;
	
	@FindBy(id="input-country")
	private WebElement country;
	
	@FindBy(id="input-zone")
	private WebElement state;
	
	@FindBy(id="input-password")
	private WebElement setPsw;
	
	@FindBy(id="input-confirm")
	private WebElement confirmPsw;
	
	@FindBy(xpath="//*[@name='newsletter' and @value='0']")
	private WebElement nLetter;
	
	@FindBy(xpath="//*[@name='agree' and @value='1']")
	private WebElement policy;
	
	@FindBy(xpath="//input[@type='submit' and @value='Continue']")
	private WebElement submit;
	
	@FindBy(linkText="My Account")
	private WebElement myAccount;
	
	@FindBy(xpath="//input[@type='submit' and @value='Login']")
	private WebElement login;
	
	public void toclickBeforeRegister() {
		this.toRegister.click();
	}
	
	public void toclickRegister() {
		this.register.click();
	}
	
	public void sendFirstName(String fstName) {
		this.firstName.sendKeys(fstName);
	}
	
	public void sendLastName(String lstName) {
		this.lastName.sendKeys(lstName);
	}
	
	public void sendemail(String eml) {
		this.email.sendKeys(eml);
	}
	
	public void sendphnno(String phn) {
		this.phnno.sendKeys(phn);
	}
	
	public void sendadd1(String address1) {
		this.add1.sendKeys(address1);
	}
	
	public void sendcity(String cityname) {
		this.city.sendKeys(cityname);
	}
	
	public void sendPostCode(String pstcd) {
		this.postCode.sendKeys(pstcd);
	}
	
	public void selectCountry(int index) throws InterruptedException {
		 Select sel= new Select(this.country);
		 List<WebElement> value1 = sel.getOptions();
		 System.out.println(value1.size());
			for (int i=0; i< value1.size(); i++)
			{
				value1.get(i).getText();
			}
			sel.selectByVisibleText("India");
			Thread.sleep(1000);
			sel.selectByIndex(index);
			Thread.sleep(1000);
			
	}
	
	public void selectState(int index) throws InterruptedException {
		 Select sel= new Select(this.state);
		 List<WebElement> value2 = sel.getOptions();
		 System.out.println(value2.size());
			for (int i=0; i< value2.size(); i++)
			{
				value2.get(i).getText();
			}
			sel.selectByVisibleText("Karnataka");
			Thread.sleep(1000);
			sel.selectByIndex(index);
			Thread.sleep(1000);
			
	}
	
	public void setPassword(String psw) {
		this.setPsw.sendKeys(psw);
	}
	
	public void confirmPassword(String conpsw) {
		this.confirmPsw.sendKeys(conpsw);
	}
	
	public void newsLetter() {
		this.nLetter.click();
	}
	
	public void clickPolicy() {
		this.policy.click();
	}
	
	public void clickSubmit() {
		this.submit.click();
	}
	
	public void clickMyAccount() {
		this.myAccount.click();
	}
	
	public void clickLogin() {
		this.login.click();
	}

}
