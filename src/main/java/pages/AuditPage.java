package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrappers;


public class AuditPage extends  GenericWrappers{
	
	
		public AuditPage clickCity() {
			
			getElementByXpath("//input[@name='city']").sendKeys("Texas");
			return this;
			
			}
		public AuditPage findState () {
			
			WebElement PD = getElementByXpath("//select[@id='id_state']");
			
			Select option = new Select(PD);
			option.selectByVisibleText("Ohio");
			return this;
			
		}
		
		public MyaddressPage findCity() {
			
			getElementByXpath("//button[@id='submitAddress']").click();
			return new MyaddressPage();
			
			
			
			
		}
		
		
	
	
	
	

}
