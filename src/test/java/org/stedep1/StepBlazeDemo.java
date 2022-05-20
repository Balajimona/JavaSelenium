package org.stedep1;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepBlazeDemo {
	WebDriver driver;

	@Given("initialize application on chrome browser")
	public void initialize_application_on_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.get("https://blazedemo.com/");

	}

	@When("enter a valid information on {string} to {string}")
	public void enter_a_valid_information_on_to(String string, String string2) {
		WebElement depature = driver.findElement(By.name("fromPort"));
		depature.sendKeys(string);
		WebElement to = driver.findElement(By.name("toPort"));
		to.sendKeys(string2);

	}

	@When("click find flight")
	public void click_find_flight() {
		WebElement click = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
		click.click();

	}

	@When("click the selective flight")
	public void click_the_selective_flight() {
		WebElement selectFlight = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input"));
		selectFlight.click();

	}

	@When("enter the name {string} and address {string} and city {string} and state {string} and zipcode {int} and cardtype {string} and cresditcard {int} and month {int} and year {int} and name of the card {string}")
	public void b(String string, String string2, String string3, String string4, Integer int1, String string5, Integer int2, Integer int3, Integer int4, String string6) {


		WebElement inputName = driver.findElement(By.id("inputName"));
		inputName.sendKeys(string);
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys(string2);
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys(string3);
		WebElement state = driver.findElement(By.id("state"));
		state.sendKeys(string4);
		WebElement zip = driver.findElement(By.id("zipCode"));
		zip.sendKeys(String.valueOf(int1));
		WebElement cardType = driver.findElement(By.id("cardType"));
		cardType.sendKeys(string5);
		WebElement creditCardNumber = driver.findElement(By.id("creditCardNumber"));
		creditCardNumber.sendKeys(string.valueOf(int2));
		WebElement creditCardYear = driver.findElement(By.id("creditCardYear"));
		creditCardYear.sendKeys(string.valueOf(int4));
		WebElement mon = driver.findElement(By.id("creditCardMonth"));
		mon.sendKeys(String.valueOf(int3));
        WebElement findElement = driver.findElement(By.id("nameOnCard"));
        findElement.sendKeys(string6);
        
	}

	@Then("validate to purchase flight")
	public void validate_to_purchase_flight() {
		WebElement findElement1 = driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input"));
		findElement1.click();

	}

}
