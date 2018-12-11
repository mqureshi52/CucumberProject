package com.syntax.cucumberproject.test.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewUserStepClass {
	WebDriver driver;
	@Given("^I open the browser$")
	public void i_open_the_browser() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User.DESKTOP-QQUOJAQ\\Desktop\\Selenium\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}

	@Given("^I navigate to the FreeCrm$")
	public void i_navigate_to_FreeCrm() {
	   driver.get("https://www.freecrm.com/index.html");
	}

	@When("^I click on sign up$")
	public void i_click_on_sign_up() throws  InterruptedException{
		Thread.sleep(2000);
	    driver.findElement(By.linkText("Sign Up")).click();
	}

	@When("^I click on Free Edition$")
	public void i_click_on_Free_Edition() throws InterruptedException{
		Thread.sleep(2000);
		WebElement dd=driver.findElement(By.xpath("//select[@id='payment_plan_id']"));
		Select dropdown= new Select(dd);
		dropdown.selectByVisibleText("Free Edition");
	   
	}

	@When("^I fill in new user information$")
	public void i_fill_in_new_user_information() {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Muneeb");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Mukhtar");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("adsfadf@adfadfadsf.com");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("adsfadf@adfadfadsf.com");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("muneebu46546546");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("gullu123");
		driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("gullu123");
		
	   	}

	@When("^I click agree terms box$")
	public void i_click_agree_terms_box(){
		driver.findElement(By.xpath("//input[@value='false']")).click();
	    	}

	@When("^I click on submit button$")
	public void i_click_on_submit_button(){
	    driver.findElement(By.xpath("//div[@class='myButton']")).click();
	}

	@When("^I fill in company information$")
	public void i_fill_in_company_information()  {
	     driver.findElement(By.xpath("//input[@id='company_name']")).sendKeys("abc woodworks"); 
	     driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("703-487-3092");
	}


	@When("^I click on continue$")
	public void i_click_on_continue() {
	      driver.findElement(By.xpath("//button[@name='btnSubmit']")).click();
	}

	@Then("^I successfully created new user$")
	public void i_successfully_created_new_user(){
		
	
	}


}
