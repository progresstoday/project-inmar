package other;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue="steps",monochrome=true,plugin={"html:target/cucumber-html-report"},tags={"@run","~@ignore"})
public class Runner {

}
