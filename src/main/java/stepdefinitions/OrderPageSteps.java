package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.OrderPage;
import wrappers.GenericWrappers;

public class OrderPageSteps extends GenericWrappers {
	
	OrderPage orderpage = new OrderPage();
	

	@Then("Validate the product Faded Short Sleeve T-shirts in SHOPPING-CART SUMMARY")
	public void verify_the_message_Product_successfully_added_to_your_shopping_cart() {
	    orderpage.verifyProductAndCheckout();
	}
	
	@Then("Click Proceed to checkout in summary")
	public void Click_Proceed_to_checkout_in_summary() {
		orderpage.verifyProductAndCheckout();
	}
	

	@Then("Click Proceed to checkout in address")
	public void click_Proceed_to_checkout_in_address() {
	    orderpage.proceedCheckout();
	}
	
	@Then("Check Terms of service and click Proceed to checkout in shipping")
	public void check_Terms_of_service_and_click_Proceed_to_checkout_in_shipping() throws InterruptedException {
	   orderpage.checkTermsAndService();
	}

	
	@Then("Click SignOut")
	public void Click_SignOut() {
	   orderpage.clickSignout();
	
	   
	}
	
	
	
	
	
	
	

}
