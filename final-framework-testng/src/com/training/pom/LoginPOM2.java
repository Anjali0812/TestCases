package com.training.pom;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class LoginPOM2 {
private WebDriver driver; 
	
	public LoginPOM2(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Login")
	private WebElement getLogin;
	
	@FindBy(linkText="Uniform Store")
	private WebElement uniform;
	
	@FindBy(xpath="//*[@alt='REGULAR T-SHIRTS (Rust)']")
	private WebElement tshirt;
	
	@FindBy(id="input-option376")
	private WebElement size;
	
	@FindBy(id="button-cart")
	private WebElement addToCart;
	
	@FindBy(xpath="//*[@id='cart']")
	private WebElement cartButton;
	
	@FindBy(xpath="//*[text()=' View Cart']")
	private WebElement viewCart;
	
	@FindBy(linkText="Checkout")
	private WebElement checkout;
	
	public void clickLogin() {
		this.getLogin.click();
	}
	
	public void getUniform() {
		this.uniform.click();
	}
	
	public void getTshirt() {
		this.tshirt.click();
	}
	
	public void getSize() throws InterruptedException {
		Select sel= new Select(this.size);
		List<WebElement> value1 = sel.getOptions();
		System.out.println(value1.size());
	    for (int i=0; i< value1.size(); i++)
			{
			    value1.get(i).getText();
			}
		 Thread.sleep(2000);
		 sel.selectByIndex(1);
		 Thread.sleep(2000);
	}
	
	public void clickOnAddToCart() {
		this.addToCart.click();
	}
	
	public void clickCart() {
		this.cartButton.click();
	}
	
	public void clickViewCart() {
		this.viewCart.click();
	}
	
	public void clickCheckout() {
		this.checkout.click();
	}
	
	
}
