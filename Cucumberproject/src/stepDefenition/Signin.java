package stepDefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	WebDriver driver;
	@Given("^open chrome and start app$")
	public void open_chrome_and_start_app() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares Required For Testing Batch\\Testing Softwares\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
	    
	}

	@When("^i enter valid crendentials$")
	public void i_enter_valid_crendentials() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("nag123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("nag123");
	    
	}

	@Then("^user should login$")
	public void user_should_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	    
	}


}
