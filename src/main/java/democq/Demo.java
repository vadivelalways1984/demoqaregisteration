package democq;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {
	static WebDriver driver;
		
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vadivelkb\\eclipse-workspace\\project class\\cucumberdemoqaregistration\\demoqaregisteration\\lib\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=GYXEWv-gAouDrAHS1o_wAg");
		driver.manage().window().maximize();
		driver.findElement(By.id("lst-ib")).sendKeys("iphone x",Keys.ENTER);
			}
	
static void goTOpage(String pagenumber) {
WebElement parentelement = driver.findElement(By.xpath("//tr[@valign='top']"));
java.util.List<WebElement> pageElements = parentelement.findElements(By.tagName("td"));
for (int i=0; i<pageElements.size(); i++ ) {
	
	String actualPage = pageElements.get(i).findElement(By.tagName("a")).getText();
	if (pageElements.equals(pagenumber)) {
		pageElements.get(i).findElement(By.tagName("a")).click();
	}
	
	
}
 



	
}	

}
