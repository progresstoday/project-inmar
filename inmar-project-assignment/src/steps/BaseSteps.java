package steps;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import pages.BasePage;

public class BaseSteps {
	
	private static WebDriver driver;
	public static String browserName = "Chrome";
	
	@Before
	public void before(Scenario scenario) {
		String scenarioName = scenario.getName().toUpperCase();
		if(scenarioName.contains("No_Browser")) {
			//..
		} else {
			if(scenarioName.contains("IE_BROWSER")) {
				System.setProperty("webdriver.ie.driver", "drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if(scenarioName.contains("FIREFOX_BROWSER")) {
				System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else if(scenarioName.contains("PHANTOMJS_BROWSER")) {
				System.setProperty("phantomjs.binary.path", "drivers\\phantomjs.exe");
				driver = new PhantomJSDriver();
			} else {
				System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			new BasePage().setDriver(driver);
			
			Matcher matcher = Pattern.compile("(.*_)(.*)(_BROWSER.*)").matcher(scenarioName);
			matcher.matches();
			browserName = matcher.group(2);
//			System.out.println(browserName);
		}
	}
	
	@After
	public void after(Scenario scenario) {
		String scenarioName = scenario.getName();
		if(scenarioName.contains("No_Browser")) {
			//..
		} else {
			driver.quit();
			driver = null;
		} 
	}
	
}
