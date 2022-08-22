package stepDefs;

import org.openqa.selenium.By;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	


	@Given("type the username {string}")
	public void typeUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}

	@And("type the password {string}")
	public void typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("clicking on the submit button")
	public void clickSubmitButton1() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("verify the home page is displayed")
	public void homePageDisplayed() {
		System.out.println("Login page is displayed");

	}
	
	
	
	}
