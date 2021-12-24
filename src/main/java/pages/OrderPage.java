package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class OrderPage extends GenericWrappers{
	
	
	public OrderPage varifyProduct() {
		
		String product = getTextByXpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[2]");
		System.out.println("Product name verified as: "+product);
		clickByXpath("(//a[@title='Proceed to checkout'])[2]");
		return this;
		
	}
	public OrderPage proceedCheckout() {
		clickByXpath("//button[@name='processAddress']");
		return this;
				
	}
	public OrderPage checkTermsAndService() throws InterruptedException {
		getElementByXpath("//input[@type='checkbox']");
		clickByXpath("//input[@type='checkbox']");
		Thread.sleep(2000);
		clickByXpath("//button[@name='processCarrier']");
		return this;
	
	}
	public OrderPage clickSignout(){
		clickByXpath("//a[@class='logout']");
		return this;
	
	

}
}
