package pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import other.WebActions;

public class ConfirmationPage extends BasePage {

	//Locators
	By firstNoInput = By.id("mathfirstnum");
	By secondNoInput = By.id("mathsecondnum");
	By captchaInput = By.id("humanCheckCaptchaInput");
	By submitBtn = By.id("Submit");
	By successMsg = By.xpath("//div[contains(@class,'text-success')]");
	
	//Methods
	public void confirmInfo() {
		WebActions.setText(driver, captchaInput, getMathVal());
		WebActions.clickElement(driver, submitBtn);
		WebActions.constWait(5);
	}

	public void verifySuccessMsg(String expMsg) {
		Assert.assertEquals(WebActions.getText(driver, successMsg).trim(), expMsg);
	}
	
	private String getMathVal() {
		return (Integer.parseInt(WebActions.getAttributeValue(driver, firstNoInput, "value")) + Integer.parseInt(WebActions.getAttributeValue(driver, secondNoInput, "value"))) + "";
	}
	
}
