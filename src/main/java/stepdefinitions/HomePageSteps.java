package stepdefinitions;

import io.cucumber.java.en.When;
import pages.HomePage;
import wrappers.GenericWrappers;

public class HomePageSteps extends GenericWrappers{
	
	HomePage homepage = new HomePage(); 
	
	@When("Click My addresses")
	public void click_My_addresses() {
	   homepage.clickMyAddress();
	}
	

}
