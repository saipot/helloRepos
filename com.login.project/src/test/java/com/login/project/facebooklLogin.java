package com.login.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebooklLogin {

	WebDriver driver;

	@Given("open Chrome Browser")
	public void open_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		throw new cucumber.api.PendingException();
	}

	@When("enter valide {string} and valide {string}")
	public void enter_valide_and_valide(String string, String string2) {
		driver.findElement(By.id("id")).sendKeys("your email : abc@gmail.com");
		driver.findElement(By.id("id")).sendKeys("your password : pass123");
		throw new cucumber.api.PendingException();
	}

	@Then("enter click")
	public void enter_click() {
		driver.findElement(By.id("id")).click();
		throw new cucumber.api.PendingException();
	}

}
