package com.training.pom;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM3 {
private WebDriver driver; 
	
	public LoginPOM3(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id='button-payment-address']")
	private WebElement billDetails;
	
	@FindBy(xpath="//*[@id='button-shipping-address']")
	private WebElement deliveryDetails;
	
	@FindBy(xpath="//*[@name='shipping_method' and @value='free.free']")
	private WebElement freeShipping;
	
	@FindBy(xpath="//*[@name='comment']")
	private WebElement addText;
	
	@FindBy(xpath="//*[@id='button-shipping-method']")
	private WebElement deliveryMethod;
	
	@FindBy(xpath="//*[@id='button-payment-method']")
	private WebElement finalContinue;
	
	@FindBy(xpath="//*[@alt='REGULAR T-SHIRTS (Rust)']")
	private WebElement againtshirt;
	
	public void continueBilling() {
		this.billDetails.click();
	}
	
	public void continueDelivery() {
		this.deliveryDetails.click();
	}
	
	public void clickFreeShipping() {
		this.freeShipping.click();
	}
	
	public void sendText(String text) {
		this.addText.sendKeys(text);
	}
	
	public void continueDeliveryMethod() {
		this.deliveryMethod.click();
	}
	
	public void clickFinalContinue() {
		this.finalContinue.click();
	}
	
	public void clickAgainTshirt() {
		//this.againtshirt.click();  not locating tshirt details after login second time
		driver.navigate().to("http://uniformm1.upskills.in/index.php?route=product/product&product_id=186");
	}

}
