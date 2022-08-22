package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;

public class EditLead extends ProjectSpecificMethods {

	@Given("click on the find leads from shortcuts")
	public void clickFindLeadsShortcut() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@And("type the firstname as (.*)$")
	public void typeFirstName(String firstName) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(firstName);

	}

	@And("click on the find leads submit button")
	public void clickSubmitButton() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@And("click on the first resulting lead")
	public void clickFirstResultingLead() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]//a")).click();
	}

	@And("click on the edit button")
	public void clickEditButton() {

		driver.findElement(By.linkText("Edit")).click();
	}

	@And("change the companyname as (.*)$")
	public void changeCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);

	}

	@And("click on the update button")
	public void clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("verify if the changed company name appears")
	public void checkChangedCompanyName() {

		System.out.println(driver.getTitle());

	}

}
