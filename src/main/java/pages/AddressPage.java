package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class AddressPage extends GenericWrappers {
	
	public AuditPage clickNewAddress() {
	
	getElementByXpath("//span[contains(text(),'Update')]").click();
	return new AuditPage();
	}
}
