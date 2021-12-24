package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AuditPage;
import wrappers.GenericWrappers;

public class AuditPageSteps extends GenericWrappers{
	
	AuditPage auditpage = new AuditPage();
	
	@When("Update State and City")
	public void update_State_and_City() {
	    auditpage.clickCity();
	    auditpage.findState();
	}
	@Then("Click Save")
	public void click_Save() {
	    auditpage.clickByXpath("//button[@id='submitAddress']");
	}



}
