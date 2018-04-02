package democq;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\vadivelkb\\eclipse-workspace\\project class\\cucumberdemoqaregistration\\features"},tags= {"@demo"},glue = { "com.test.Cucumber" } ,plugin = { "pretty",
		"html:target/cucumber-html-report" })

public class TestRunner {
	
	

}
