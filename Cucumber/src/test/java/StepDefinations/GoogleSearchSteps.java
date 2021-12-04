package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null ; 
	
	@Given("Browser is open")
	public void browser_is_open() {
	  System.out.println("Browser opened");
	  
	  String Path = System.getProperty("user.dir") ;
	  System.out.println(Path) ;
	  
	  System.setProperty("webdriver.chrome.driver",Path+"/Driver/chromedriver.exe") ;
	  
	  driver = new ChromeDriver() ;
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
	  
	  driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS) ;
	  
	  driver.manage().window().maximize(); 
	  
	  
	  
	}

	@And("user is on Google Search page")
	public void user_is_on_google_search_page() {
		driver.navigate().to("https://www.google.com") ;
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Automation") ;
		
	}

	@And("hit enter")
	public void hit_enter() {
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys(Keys.ENTER) ;
	}

	@Then("user navigate to SearchResult")
	public void user_navigate_to_search_result() {
		driver.getPageSource().contains("What is automation? | IBM");
		driver.close() ;
		driver.quit();
	}

	
}
