package stepdefinitions;

import io.cucumber.java.en.When;
import pages.UpdatePage;
import wrappers.GenericWrappers;

public class UpdatePageSteps extends GenericWrappers{
	
	UpdatePage updatepage = new UpdatePage();
	@When("Click Update")
	public void click_Update() {
	    updatepage.ClickUpdate();
	}

}
