package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	WebDriver driver;

	@Given("I want to launch the url")
	public void i_want_to_launch_the_url() {
		driver = DriverFactory.getDriver();

	}

	@When("I enter the username and password")
	public void i_enter_the_username_and_password() {
		
		System.out.println("####################");
		
System.out.println(		System.getenv("USERNAME"));

		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("uytuytu");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("uytuytu");



	}

	@Then("I am loggen in")
	public void i_am_loggen_in() {
		driver.findElement(By.xpath("//*[@id='Submit_btn']")).click();

	}

}
