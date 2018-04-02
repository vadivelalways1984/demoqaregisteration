package democq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Radiobuttontext {

	WebDriver driver;
	WebElement single,married,divorced;
	
	@Given("^User is in DemoQa Register page$")
	public void user_is_in_DemoQa_Register_page() throws Throwable {
	   
		 // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vadivelkb\\eclipse-workspace\\project class\\cucumberdemoqaregistration\\lib\\geckodriver.exe");
	    driver= new FirefoxDriver();
		driver.get("http://demoqa.com/registration/");
	   
	}

	@When("^User enter the RadioButton$")
	public void user_enter_the_RadioButton() throws Throwable {
	   
		// Write code here that turns the phrase above into concrete actions
				single=driver.findElement(By.xpath("//input[@value='single']"));
				single.click();
	   
	}

	@Then("^I validate the Checked RadioButton$")
	public void i_validate_the_Checked_RadioButton() throws Throwable {
	    
	    // Write code here that turns the phrase above into concrete actions
			if(single.isSelected()||married.isSelected()||divorced.isSelected()) {
				Assert.assertTrue(true);
			}
	}

}
