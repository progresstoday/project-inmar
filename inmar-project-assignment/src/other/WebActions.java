package other;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebActions {

	public static void launch(WebDriver driver, String url) {
		driver.get(url);
	}
	
	public static void constWait(int seconds) {
		try {
			Thread.sleep(seconds*1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static WebElement findElement(WebDriver driver, By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> findElements(WebDriver driver, By locator) {
		return driver.findElements(locator);
	}

	public static void setText(WebDriver driver, By locator, String text) {
		findElement(driver, locator).sendKeys(text);
	}

	public static String getText(WebDriver driver, By locator) {
		return findElement(driver, locator).getText();
	}

	public static String getAttributeValue(WebDriver driver, By locator, String attribute) {
		return findElement(driver, locator).getAttribute(attribute);
	}

	public static void clickElement(WebDriver driver, By locator) {
		findElement(driver, locator).click();
	}

	public static void clickElement2(WebDriver driver, WebElement fe) {
		fe.click();
	}
	
	public static WebElement getARandomElement(WebDriver driver, By locator) {
		List<WebElement> weList = WebActions.findElements(driver, locator);
		Random rand = new Random();
		return weList.get(rand.nextInt(weList.size()));
	}
	
	public static void selectUnselectCheckbox(WebDriver driver, By locator, String condition) {
		boolean isSelected = findElement(driver, locator).isSelected();
		if("select".equalsIgnoreCase(condition) && !isSelected) {
			findElement(driver, locator).click();
		} else if("unselect".equalsIgnoreCase(condition) && isSelected) {
			findElement(driver, locator).click();
		}
	}

	public static void selectDropdownValue(WebDriver driver, By locator, String valueToSelect) {
		new Select(findElement(driver, locator)).selectByVisibleText(valueToSelect);
	}

	public static Object jsExecutor(WebDriver driver, String command) {
		return ((JavascriptExecutor)driver).executeScript(command);
	}

	public static long getARandomNumber(int length) {
		Random rand = new Random();
		long number = rand.nextInt(10);
		if(length>1) {
			int n1 = rand.nextInt(10);
			n1=n1==0?1:n1;
			number = (long) (Math.pow(10, length-1)*n1+rand.nextInt((int) (Math.pow(10, length-1))));
		}
		return number;
	}

	public static String getARandomWord(int length) {
		Random rand = new Random();
		char[] charArr = new char[length];
		for (int i = 0; i < length; i++) {
			charArr[i] = (char) ('a'+rand.nextInt(26));
		}
		return new String(charArr);
	}

	public static char getARadomCharacter(char actChar) {
		Random rand = new Random();
		if((actChar+"").matches("[a-zA-Z]")) {
			actChar = (char) ('a'+rand.nextInt(26));
		} else if((actChar+"").matches("[1]")) {
			int ra = rand.nextInt(10);
			//			System.out.println(ra+" number");
			actChar = (char) ('0'+ra);
		} else {
			actChar = '@';
		}
		return actChar;
	}

	public static String getARandomPassword(int length) {
		List<Character> expCharList = new ArrayList<Character>();
		expCharList.add('a');
		expCharList.add('A');
		expCharList.add('@');
		expCharList.add('1');

		char[] charArr = new char[length];
		List<Character> tempExpCharList = new ArrayList<Character>(expCharList);
		Random rand = new Random();
		char expChar = 'a';
		for (int i = 0; i < length; i++) {
			//			System.out.println("tempExpCharList.size() "+tempExpCharList.size());
			int tempIndex = rand.nextInt(tempExpCharList.size());
			char tempChar = tempExpCharList.get(tempIndex);
			expChar = getARadomCharacter(tempChar);
			tempExpCharList.remove(tempIndex);
			if(tempExpCharList.isEmpty()) {
				//				System.out.println("empty");
				tempExpCharList = new ArrayList<Character>(expCharList);
			}
			charArr[i] = expChar;
			//			System.out.println(expChar+" "+tempChar);
		}
		return new String(charArr);
	}
}
