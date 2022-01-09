package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import wrappers.GenericWrappers;

public class LoginSteps extends GenericWrappers{

	LoginPage loginPage = new LoginPage();
	
	@And("Enter email")
	public void enter_email() {
		loginPage.enterEmail();
	}

	@Given("Enter password")
	public void enter_password() {
		loginPage.enterPassword();
	}
	@When("Click login")
	public void click_login() {
		loginPage.clickLogin();
	}
	@Then("Quite Browser")
	public void quite_Browser() {
	    loginPage.closeBrowser();
	}
}
