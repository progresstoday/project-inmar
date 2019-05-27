package pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Random;
import org.openqa.selenium.By;
import other.WebActions;

public class PersonalInformationPage extends BasePage {

	//Locators
	By firstNameInput = By.id("fname");
	By lastNameInput = By.id("lname");
	By genderDD = By.id("gender");
	By dobInput = By.id("birthdate");
	By yearBtn = By.xpath("//*[@class='year']");
	By monthBtn = By.xpath("//*[@class='month']");
	By dayBtn = By.xpath("//*[@class='day']");
	By addressInput = By.id("address");
	By addressesList = By.xpath("//*[@class='pac-item']");
	By phoneNoInput = By.id("phone");
	By prefContactEmailRadioBtn = By.id("preferedcontact1");
	By prefContactPhoneRadioBtn = By.id("preferedcontact2");
	By attachFileInput = By.id("attachedFile");
	By browseBtn = By.xpath("//span[contains(.,'Browse')]");
	By nextBtn = By.xpath("//button[@onclick='nextStep3()']");

	//Methods
	public void enterPersonalInfo() {
		String firstName = WebActions.getARandomWord(8);
		String lastName = WebActions.getARandomWord(8);
		String gender = getGender();
		String phoneNumber = WebActions.getARandomNumber(6)+"";
		String address = WebActions.getARadomCharacter('A')+"";
		By prefContact = getPreferredContact();
		String profileImagePath = "C:\\Users\\mkanikar.ORADEV\\Desktop\\Untitled.png";//TODO-remove
		
		WebActions.setText(driver, firstNameInput, firstName);
		WebActions.setText(driver, lastNameInput, lastName);
		WebActions.selectDropdownValue(driver, genderDD, gender);
		selectDate();
		selectAddress(address);
		WebActions.setText(driver, phoneNoInput, phoneNumber);
		selectPrefferedContactMethod(prefContact);
		selectProfileImage(profileImagePath);
		WebActions.constWait(3);
		WebActions.clickElement(driver, nextBtn);
	}

	private String getGender() {
		Random rand = new Random();
		String[] paymentTypesArr = new String[]{"Male","Female"};
		return paymentTypesArr[rand.nextInt(2)];
	}
	
	private By getPreferredContact() {
		Random rand = new Random();
		By[] prefContactArr = new By[]{prefContactEmailRadioBtn,prefContactPhoneRadioBtn};
		return prefContactArr[rand.nextInt(2)];
	}
	
	private void selectDate() {
		WebActions.clickElement(driver, dobInput);
		
		WebActions.clickElement2(driver, WebActions.getARandomElement(driver, yearBtn));
		WebActions.clickElement2(driver, WebActions.getARandomElement(driver, monthBtn));
		WebActions.clickElement2(driver, WebActions.getARandomElement(driver, dayBtn));
	}
	
	private void selectAddress(String address) {
		WebActions.clickElement(driver, addressInput);
		WebActions.setText(driver, addressInput, address);
		WebActions.clickElement(driver, addressInput);
		WebActions.constWait(3);
		WebActions.clickElement(driver, addressesList);
	}

	private void selectPrefferedContactMethod(By prefContact) {
		WebActions.clickElement(driver, prefContact);
	}

	private void selectProfileImage(String profileImagePath) {
		WebActions.clickElement(driver, browseBtn);
		WebActions.constWait(3);

		StringSelection data = new StringSelection(profileImagePath);
		Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
		cb.setContents(data, data);

		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			 e.printStackTrace();
		}
	}

}
