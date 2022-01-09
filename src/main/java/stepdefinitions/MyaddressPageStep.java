package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyaddressPage;
import wrappers.GenericWrappers;

public class MyaddressPageStep extends GenericWrappers{
	
	MyaddressPage myaddresspage = new MyaddressPage(); 
	
	@When("Click My addresses")
	public void click_My_addresses() {
	   myaddresspage.clickMyAddress();
	}
	
	@Then("Mouse hover on women and click T-shirts")
	public void mouse_hover_on_and_click_T_shirts() {
	    myaddresspage.clickWomen();
	    
	}

}
