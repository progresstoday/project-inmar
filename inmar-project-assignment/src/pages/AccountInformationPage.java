package pages;

import org.openqa.selenium.By;
import other.WebActions;

public class AccountInformationPage extends BasePage {

	//Locators
	By usernameInput = By.id("uname");
	By emailInput = By.id("email");
	By passwordInput = By.id("pass");
	By confirmPasswordInput = By.id("cpass");
	By nextBtn = By.xpath("//button[@onclick='nextStep2()']");
	
	//Methods
	public void launchApplication(String url) {
		WebActions.launch(driver, url);
		WebActions.constWait(5);
	}
	
	public void enterAccountInfo() {
		String username = WebActions.getARandomWord(8);
		String email = WebActions.getARandomWord(8)+"@gmail.com";
		String password = WebActions.getARandomPassword(8);
		String confirmPassword = password;
		
		WebActions.setText(driver, usernameInput, username);
		WebActions.setText(driver, emailInput, email);
		WebActions.setText(driver, passwordInput, password);
		WebActions.setText(driver, confirmPasswordInput, confirmPassword);
		WebActions.clickElement(driver, nextBtn);
		WebActions.constWait(2);
	}
	
}
