package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoWebShop {
	WebDriver driver;



	@Given("Demowebshop website is launched")
	public void demowebshop_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.setProperty("webdriver.gecko.driver","C:\\Pratiksha\\SeleniumDrivers\\geckodriver-v0.26.0-win64 (1)\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");

	}

	@Given("User clicks on register link")
	public void user_clicks_on_register_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@When("User enters the details")
	public void user_enters_the_details() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("Clicks on register button for account creation")
	public void clicks_on_register_button_for_account_creation() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("Registered user clicks on Login Link")
	public void registered_user_clicks_on_Login_Link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("User enters the required credentials")
	public void user_enters_the_required_credentials() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("Clicks on Login button to acces the website")
	public void clicks_on_Login_button_to_acces_the_website() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("Registered user is successfully logged in DemowebShop")
	public void registered_user_is_successfully_logged_in_DemowebShop() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@When("User enters name of particular item in the search bar")
	public void user_enters_name_of_particular_item_in_the_search_bar() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@When("Click on search button")
	public void click_on_search_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("Details of searched item is displayed")
	public void details_of_searched_item_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Given("User verifies the details mentioned of product")
	public void user_verifies_the_details_mentioned_of_product() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}

	@Then("User clicks on Add to Cart button")
	public void user_clicks_on_Add_to_Cart_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new cucumber.api.PendingException();
	}



}

