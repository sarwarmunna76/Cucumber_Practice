package pages;


import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class MyaddressPage extends  GenericWrappers{
	
	
	public TshirtPage clickWomen() {
		mouseOverByXpath("//a[@title='Women']");
		clickByXpath("//a[@title='T-shirts']");
		return new TshirtPage();
		
	}
		public AuditPage clickNewAddress() {
			
			getElementByXpath("//span[contains(text(),'Update')]").click();
			return new AuditPage();
			}
		public MyaddressPage varifyStateName() {
			
			String city = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[1]");
			System.out.println("City of the Address verified as: "+city);
			return this;
			
		}
		public MyaddressPage varifycityName() {
			
			String city = getTextByXpath("//*[@id=\"center_column\"]/div[1]/div/div/ul/li[5]/span[2]");
			System.out.println("City of the Address verified as: "+city);
			return this;
			
		}
		
		public LoginPage clickSignOut(){
			clickByXpath("//a[@class='logout']");
			return new LoginPage(); 
			
		
		
			
			
			
			
			
			
			
			
			
		

}
}
