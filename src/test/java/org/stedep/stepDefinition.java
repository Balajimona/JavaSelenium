package org.stedep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class stepDefinition {
	WebDriver driver;
	@Given("user is on adactin hotel app on chrome browser")
	public void user_is_on_adactin_hotel_app_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		WebElement txtPass = driver.findElement(By.id("email"));
		txtPass.sendKeys("bala@123");

	}

	@When("user should click login button")
	public void user_should_click_login_button() {
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@Then("user validate home page")
	public void user_validate_home_page() {
		System.out.println("Invalid Username");
	}


}


