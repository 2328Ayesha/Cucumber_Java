package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginPageStep {

	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\sayal\\eclipse-workspace\\cucumberjava\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	    driver.get("https://www.facebook.com/");
	}
	@When("USer Enter EmailID")
	public void u_ser_enter_email_id() {
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("asbk@gmail.com");
	}
	@When("User Enter Password")
	public void user_enter_password() {
	   driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@123");
	}
	@When("User Click on Login Button")
	public void user_click_on_login_button() {
	    driver.findElement(By.xpath("//button[@name='login']")).click();
	}
	@Then("User should be on HomePage")
	public void user_should_be_on_home_page() {
	   String acttitle=driver.getTitle();
	   String exptitle="Log in to Facebook";
	   Assert.assertEquals(exptitle, acttitle);
	}
	@And("User closes browser")
	public void User_closes_browser() throws InterruptedException {
		
		Thread.sleep(5000);
		driver.close();
	}
	
}


