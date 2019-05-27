package pages;

import org.openqa.selenium.By;
import other.WebActions;
import steps.BaseSteps;

public class PageLoadTimePage extends BasePage {

	//Locators
	By body = By.tagName("body");
	
	//Methods
	public void launchApplication(String url) {
		long start = System.currentTimeMillis();
		WebActions.launch(driver, url);
		long end = System.currentTimeMillis();
		System.out.println("URL: "+url);
		System.out.println("Browser: "+BaseSteps.browserName);
		System.out.println("Load Time (ms): "+(end-start));
	}
}
