package steps;

import cucumber.api.java.en.Given;

public class NumbersAdditionSteps {

	@Given("^add numbers (\\d+) and (\\d+)$")
	public void addNumbers(int num1, int num2) {
		System.out.println("The sum of numbers "+num1+" and "+num2+" is "+(num1+num2));
	}
}
