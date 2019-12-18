package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DemoBackground {
	WebDriver driver;

	@Given("Application is launched by user XY")
	public void application_is_launched_by_user_XY() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		System.setProperty("webdriver.gecko.driver","C:\\Pratiksha\\SeleniumDrivers\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("User clicks on Signup link XY")
	public void user_clicks_on_Signup_link_XY() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();	
	}

	@Then("valid data has be provide XY")
	public void valid_data_has_be_provide_XY() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Cristiano");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Ronaldo");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("cristianoronaldo@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Cristiano07");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Cristiano07");
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();

	}

	@Then("Verifies the registration process and perform logout XY")
	public void verifies_the_registration_process_and_perform_logout_XY() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.close();
	}



}
