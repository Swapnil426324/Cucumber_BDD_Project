package com.step_defination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step {

	WebDriver driver;
	LoginPage lp;

	// for valid login scenario
	@Given("user should be on chrome browser")
	public void user_should_be_on_chrome_browser() {
		driver = new ChromeDriver();
		driver.get("https://javabykiran.com/liveproject/index.html");
		lp = new LoginPage(driver);
	}

	@When("user enter username, password")
	public void user_enter_username_password() {
		lp.username("kiran@gmail.com");
		lp.password("123456");
	}

	@When("click on login button")
	public void click_on_login_button() {
		lp.signInClick();
	}

	@Then("page should be navigate home page")
	public void page_should_be_navigate_home_page() {
		Assert.assertEquals(driver.getTitle(), "Welcome To the Kiran Academy !!!");
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
	
	// for invalid scenario
	@When("user enter invalid username, password")
	public void when_user_enter_username_password() throws InterruptedException {
		lp.username("swapnil@gmail.com");
		lp.password("12345");
	
	}
	
	@Then("error massage should be dispaly to the user")
	public void error_massage_should_be_dispaly_to_the_user() {
		String actualMsg=driver.findElement(By.id("email_error")).getText();
		Assert.assertEquals("Please enter email as kiran@gmail.com", actualMsg);
	}
	
	// for scenario multiple data set
	@When("the user enters username {string} and password {string}")
	public void the_user_enters_username_and_password(String username, String password) {
		lp.username(username);
		lp.password(password);
	}
}
