package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.TshirtPage;
import wrappers.GenericWrappers;

public class TshirtPageSteps extends GenericWrappers{
	
	TshirtPage tshirtpage = new TshirtPage();
	
	
	@Then("Scroll to product Faded Short Sleeve T-shirts mouse hover and add to cart")
	public void scroll_to_product_Faded_Short_Sleeve_T_shirts_mouse_hover_and_add_to_cart() throws InterruptedException {
	    tshirtpage.scrollToElement();
	}
	
	@And("Verify the message Product successfully added to your shopping cart")
	public void Verify_the_message_Product_successfully_added_to_your_shopping_cart() throws InterruptedException {
		tshirtpage.scrollToElement();
	}
	
	@Then("Click Proceed to checkout")
	public void Click_Proceed_to_Checkout() throws InterruptedException {
		tshirtpage.scrollToElement();
	}
	

	
}

