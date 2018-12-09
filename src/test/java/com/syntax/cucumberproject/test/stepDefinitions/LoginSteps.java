package com.syntax.cucumberproject.test.stepDefinitions;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;



public class LoginSteps {

	WebDriver driver;	

	
@Given("^I open browser$")
public void i_open_browser() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\User.DESKTOP-QQUOJAQ\\eclipse-workspace\\CucumberProject\\src\\test\\resources\\drivers\\chromedriver.exe");
     driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();
   System.out.println("browser is open");;
	
}

@Given("^I navigate to FreeCrm$")
public void i_navigate_to_FreeCrm() {
	 String url = "https://www.freecrm.com/index.html";
     driver.get(url);
     System.out.println("navigate free crm");
}

@When("^I enter username and password$")
public void i_enter_username_and_password() {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("mqureshi52");
    driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Diamondcouch52");
    System.out.println("username password entered");
}
@When("^I click login button$")
public void i_click_login_button() throws Throwable {
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
    System.out.println("clicked login button");
	}

@Then("^I successfully logged in$")
public void i_successfully_logged_in() {
    String abc="CRMPRO";
    String xyz=driver.getTitle();
    Assert.assertEquals(abc, xyz);
    
	System.out.println("Successfully logging in");}

	}
	   