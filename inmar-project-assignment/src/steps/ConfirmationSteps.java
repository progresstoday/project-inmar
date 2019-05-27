package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ConfirmationPage;

public class ConfirmationSteps {

	ConfirmationPage confirmationPage = new ConfirmationPage();
	
	@When("^confirm info$")
	public void confirmInfo() {
		confirmationPage.confirmInfo();
	}
	
	@Then("^verify success message$")
	public void verifySuccessMsg() {
		String expMsg = "You have finished all steps of this html form successfully";
		confirmationPage.verifySuccessMsg(expMsg);
	}
}
