package steps;

import cucumber.api.java.en.When;
import pages.PersonalInformationPage;

public class PersonalInformationSteps {

	PersonalInformationPage personalInformationPage = new PersonalInformationPage();
	
	@When("^enter personal information$")
	public void enterPersonalInfo() {
		personalInformationPage.enterPersonalInfo();
	}
}
