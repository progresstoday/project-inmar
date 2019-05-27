package steps;

import cucumber.api.java.en.When;
import pages.PaymentDetailsPage;

public class PaymentDetailsSteps {

	PaymentDetailsPage paymentDetailsPage = new PaymentDetailsPage();
	
	@When("^enter payment details$")
	public void enterPaymentDetails() {
		paymentDetailsPage.enterPaymentDetails();
	}
}
