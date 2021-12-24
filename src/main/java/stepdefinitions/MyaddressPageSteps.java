package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyaddressPage;
import wrappers.GenericWrappers;

public class MyaddressPageSteps extends GenericWrappers {
	
	MyaddressPage myaddresspage = new MyaddressPage();
	
	@When("Click Update")
	public void click_Update() {
	    myaddresspage.clickByXpath("//span[contains(text(),'Update')]");
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
