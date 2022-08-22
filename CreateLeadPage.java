package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;


import io.cucumber.java.en.And;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	

	@Given("click SRMFA link")
	public void clickSRMFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}

	@And("click leads tab")
	public void clickLeadsTab() {
		driver.findElement(By.linkText("Leads")).click();

	}

	@And("click create lead link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();

	}

	
	@And("type the Company name as (.*)$")
	public void typeCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);

	}

	
	@And("type the first name as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);

	}

	
	@And("type the last name as (.*)$")
	public void typeLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);

	}

	@And("click create leads Button")
	public void clickCreateLeadsButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("verify the view leads page")
	public void viewLeadsPage() {
		String title = driver.getTitle();
		if (title.contains("View Leads")) {
			System.out.println("Got It !!");
		}

	}

}
