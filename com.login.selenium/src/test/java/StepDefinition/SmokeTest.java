package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	WebDriver driver;

	@Given("^open Chrome Browser$")
	public void open_Chrome_Browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		throw new PendingException();
	}

	@When("^enter valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_valid_and(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys("uname");
		driver.findElement(By.id("pass")).sendKeys("pass");
		throw new PendingException();
	}

	@Then("^login successful$")
	public void login_successful() throws Throwable {
		driver.findElement(By.id("u_0_2")).click();
		throw new PendingException();
	}

}
