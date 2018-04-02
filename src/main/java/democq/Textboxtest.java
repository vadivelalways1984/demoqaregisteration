package democq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Textboxtest {
	
	WebElement firstName, lastName, phonenumber, username, email, aboutyourSelf, password, confirmPassword;
	
	@Given("^User is in Register page$")
	public void user_is_in_Register_page() throws Throwable {
		
			// Write code here that turns the phrase above into concrete actions
			Base.driver.get("http://demoqa.com/registration/");
			System.out.println("end of given");
	    
	}

	@When("^User enter the firstname and lastname | fName | lName |  | Bala  | Sri   |   | Prem  | Sir   |$")
	public void user_enter_the_firstname_and_lastname_fName_lName_Bala_Sri_Prem_Sir() throws Throwable {
	   
		// Write code here that turns the phrase above into concrete actions
				firstName = Base.driver.findElement(By.id("name_3_firstname"));
				firstName.sendKeys("vadivel");
				lastName = Base.driver.findElement(By.id("name_3_lastname"));
				lastName.sendKeys("babu");
				phonenumber = Base.driver.findElement(By.id("phone_9"));
				phonenumber.sendKeys("9952706659");
				username = Base.driver.findElement(By.id("username"));
				username.sendKeys("vadivelbabu");
				email = Base.driver.findElement(By.id("email_1"));
				email.sendKeys("vadivelkb@gmail.com");
				aboutyourSelf = Base.driver.findElement(By.id("description"));
				aboutyourSelf.sendKeys("say something");
				password = Base.driver.findElement(By.id("password_2"));
				password.sendKeys("123456");
				confirmPassword = Base.driver.findElement(By.id("confirm_password_password_2"));
				confirmPassword.sendKeys("123456");
				System.out.println("end of when");
		
	}

	@Then("^The user validate the entered firstname and lastname$")
	public void the_user_validate_the_entered_firstname_and_lastname() throws Throwable {
		
		Assert.assertEquals("vadivel", firstName.getAttribute("value"));
		Assert.assertEquals("babu", lastName.getAttribute("value"));
		Assert.assertEquals("9952706659", phonenumber.getAttribute("value"));
		Assert.assertEquals("vadivelbabu", username.getAttribute("value"));
		Assert.assertEquals("vadivelkb@gmail.com", email.getAttribute("value"));
		Assert.assertEquals("say something", aboutyourSelf.getAttribute("value"));
		Assert.assertEquals("123456", password.getAttribute("value"));
		Assert.assertEquals("123456", confirmPassword.getAttribute("value"));
		System.out.println("end of then");
	  
	}
	
	@When("^User enter the firstname and lastname$")
	public void user_enter_the_firstname_and_lastname(DataTable names) throws Throwable {
		 List<List<String>> values = names.asLists(String.class);
		System.out.println(values);
		firstName = Base.driver.findElement(By.id("name_3_firstname"));
		lastName = Base.driver.findElement(By.id("name_3_lastname"));
		firstName.sendKeys(values.get(0).get(0));
		lastName.sendKeys(values.get(0).get(1));
	}



}
