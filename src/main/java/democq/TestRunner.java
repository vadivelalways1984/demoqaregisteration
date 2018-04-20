package democq;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\vadivelkb\\eclipse-workspace\\project class\\cucumberdemoqaregistration\\demoqaregisteration\\features"},plugin = { "pretty",
		"html:target/cucumber-html-report" })

public class TestRunner {
	
	

}
