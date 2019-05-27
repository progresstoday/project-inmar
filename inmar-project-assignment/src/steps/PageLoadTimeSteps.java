package steps;

import javax.swing.JOptionPane;
import cucumber.api.java.en.Given;
import pages.PageLoadTimePage;

public class PageLoadTimeSteps {

	PageLoadTimePage pageLoadTimePage = new PageLoadTimePage();
	
	@Given("^measure load time of application$")
	public void launchApplication() {
		String url = JOptionPane.showInputDialog(null, null, "Enter URL", 1);
		pageLoadTimePage.launchApplication(url);
	}
}
