package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddressPage;
import wrappers.GenericWrappers;

public class AddressPageSteps extends GenericWrappers {
	
	AddressPage myaddresspage = new AddressPage();
	
	@When("Click Update")
	public void click_Update() {
	    myaddresspage.clickUpdate();
	}
	
	@Then("Validate Update")
	public void validate_Update() {
	    myaddresspage.varifyStateName();
	    myaddresspage.varifycityName();
	}
	@Then("Click SignOut")
	public void click_SignOut() {
	    myaddresspage.clickSignOut();
	}
	
	
	
	

}
