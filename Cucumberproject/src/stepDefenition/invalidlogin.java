package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class invalidlogin {
	WebDriver driver;
	@Given("^start chrome browser and open application$")
	public void start_chrome_browser_and_open_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	    
	}

	@When("^i enter invalid username and password$")
	public void i_enter_invalid_username_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("nag123@@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nagqww123");
	    
	   
	} 

	@Then("^i should not login$")
	public void i_should_not_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	   
	}



}
