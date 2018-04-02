package democq;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Base {

	static WebDriver driver;

	@Before
	public static void beforeMethod(Scenario myscenario) {
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\Sample\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		if(myscenario.getName().equals("Login Scenario")) {
			System.out.println("do some operation");
		}
		System.out.println("before method");
	}

	@After
	public static void afterMethod() {
		driver.close();
		//driver.quit();
	}

}
