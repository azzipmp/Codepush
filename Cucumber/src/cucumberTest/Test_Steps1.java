package cucumberTest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps1 {
	
		 WebDriver driver; 
		 String url = "http://newtours.demoaut.com/";
		 //String sExpected = "Register: Mercury Tours";
		 String sActualValue;

@Given("^I am on the signon$")
public void navigatetohomepageagain() throws InterruptedException, Throwable 
{
	System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	driver.manage().window().maximize();
   	driver.get(url);
  	Thread.sleep(2000);
  	 System.out.println( "navigatetohomepage");	  	
}
@When("^click on signonpage$")
public void navigatetosignonpage() throws InterruptedException, Throwable
{
	 System.out.println( "navigatetoregisterpage");
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(3000);
}
@Then("^Sigon page displayed$")
public void Signonpagedisplayed() throws InterruptedException, Throwable
{
	sActualValue= driver.getTitle();
	String sExpected="Sign-on: Mercury Tours";
	Assert.assertEquals("Checking the signon title", sExpected, sActualValue);
	System.out.println( "expected"+sExpected);
	System.out.println( "actual"+sActualValue);
	driver.close();	
}
}