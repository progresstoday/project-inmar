package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.AccountInformationPage;

public class AccountInformationSteps {

	AccountInformationPage accountInformationPage = new AccountInformationPage();
	
	@Given("^launch reg form application$")
	public void launchApplication() {
		accountInformationPage.launchApplication("https://mgsdemo.mgscoder.com/mgscode/regform/index-2.html");
	}
	
	@When("^enter account information$")
	public void enterAccountInfo() {
		accountInformationPage.enterAccountInfo();
	}
}
