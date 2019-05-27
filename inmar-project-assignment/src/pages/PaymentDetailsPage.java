package pages;

import java.util.Random;

import org.openqa.selenium.By;
import other.WebActions;

public class PaymentDetailsPage extends BasePage {

	//Locators
	By paymentTypeDD = By.id("paymenttype");
	By cardHolderNameInput = By.id("hname");
	By cardNoInput = By.id("cardnumber");
	By cvcNoInput = By.id("cvc");
	By expiryDateInput = By.id("expirydate");
	By yearBtn = By.xpath("//*[@class='year new']");
	By monthBtn = By.xpath("//*[@class='month']");
	By agreementCheckBox = By.id("aggre");
	By nextBtn = By.xpath("//button[@onclick='nextStep4()']");
	
	//Methods
	public void enterPaymentDetails() {
		String paymentType = getPaymentType();
		String accHolderName = WebActions.getARandomWord(8);
		String cardNo = WebActions.getARandomNumber(16)+"";
		String cvcNo = WebActions.getARandomNumber(3)+"";
		
		WebActions.selectDropdownValue(driver, paymentTypeDD, paymentType);
		WebActions.setText(driver, cardHolderNameInput, accHolderName);
		WebActions.setText(driver, cardNoInput, cardNo);
		WebActions.setText(driver, cvcNoInput, cvcNo);
		selectDate();
		WebActions.selectUnselectCheckbox(driver, agreementCheckBox, "select");
		WebActions.clickElement(driver, nextBtn);
		WebActions.constWait(5);
	}
	
	private String getPaymentType() {
		Random rand = new Random();
		String[] paymentTypesArr = new String[]{"Visa Card","Master Card"};
		return paymentTypesArr[rand.nextInt(2)];
	}

	private void selectDate() {
		WebActions.clickElement(driver, expiryDateInput);
		WebActions.clickElement2(driver, WebActions.getARandomElement(driver, yearBtn));
		WebActions.clickElement2(driver, WebActions.getARandomElement(driver, monthBtn));
	}
	
}
