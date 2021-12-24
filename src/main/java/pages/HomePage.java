package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class HomePage extends  GenericWrappers{
	
	
	
		
		public MyaddressPage clickMyAddress() {
			
			clickByXpath("//span[contains(text(),'My addresses')]");
			return new MyaddressPage();
			
		 
		}
		
	
	


}
