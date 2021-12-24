package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class TshirtPage extends GenericWrappers{
	
	

	public OrderPage scrollToElement() throws InterruptedException {
		
		 mouseOverByXpath("//img[@itemprop='image']");
		
		clickByXpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span");
		Thread.sleep(3000);
		driver.switchTo().alert().getText();
		clickByXpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
		return new OrderPage();
		
	}
	
}