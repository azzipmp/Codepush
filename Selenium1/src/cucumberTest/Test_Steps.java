package cucumberTest;

import org.testng.Assert;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Test_Steps {

	  WebDriver driver; 
	 String url = "http://newtours.demoaut.com/";
	 String sExpected = "Welcome: Mercury Tours";
	 String sActualValue;
	 
@Given("^I am on the home page$")

public void navigatetohomepage() throws InterruptedException  
{
System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver.exe");
driver = new FirefoxDriver();
driver.manage().window().maximize();
 	driver.get(url);
	Thread.sleep(2000);
	 System.out.println( "navigatetohomepage");
	
}

@When("^click on register link$")
public void navigatetoregisterpage() throws InterruptedException, Throwable
{
System.out.println( "navigatetoregisterpage");
	driver.findElement(By.linkText("REGISTER")).click();
}


@Then("^register page displayed$")
public void registerpagedisplayed() throws InterruptedException, Throwable
{
sActualValue= driver.getTitle();

Assert.assertEquals(sExpected, sActualValue);
System.out.println( "expected"+sExpected);
System.out.println( "actual"+sActualValue);
driver.quit();

}
 
}