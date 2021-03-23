package org.stepdefenition;

import org.junit.Assert;
import org.objectrepository.LoginPojo;
import org.objectrepository.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefenition extends BaseClass {
	PageObjectManager pom;
	LoginPojo lp;

	@Given("User is in the login page")
	public void user_is_in_the_login_page() {
		System.out.println("Welcome to SAAS REmaap");
	}

	@When("User passing the {string} and {string}")
	public void user_passing_the_and(String username, String password) {
		pom = PageObjectManager.getPom();
		lp = pom.getLp();
		fillTextbox(lp.getTxtUserName(), username);
		fillTextbox(lp.getTxtPassword(), password);
	}

	@When("Clicking on the login button")
	public void clicking_on_the_login_button() throws InterruptedException {
		WebElement loginn = lp.getBtnLoginn();
		loginn.click();
		Thread.sleep(2000);
	}

	@Then("User should see the invalid password after dashboard")
	public void user_should_see_the_invalid_password_after_dashboard() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("Need to verify the login page", url.contains("https://saas.remaap.com/app/login"));
		System.out.println("Successfully logged in");
	}

	@When("user click on the project")
	public void user_click_on_the_project() throws InterruptedException {
		// LoginPojo lp = new LoginPojo();
		fillTextbox(lp.getTxtUserName(), "rnooralamine@entrustsoft.in");
		fillTextbox(lp.getTxtPassword(), "Admin@123");
		WebElement b1 = lp.getBtnLoginn();
		b1.click();
		Thread.sleep(3000);
		WebElement projName = driver.findElement(By.xpath("//a[text()=\"Support \"]"));
		projName.click();
	}

	@Then("user should see the lease details page")
	public void user_should_see_the_lease_details_page() {
		System.out.println("User should be in lease details screen...");
	}

}
