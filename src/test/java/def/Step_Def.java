package def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Def {
	public WebDriver driver;
	@Given("openApplication")
	public void open_application() {
	    driver =new ChromeDriver();
	    driver.get("http://183.82.103.245/nareshit/login.php");
	    System.out.println("application is opened");
	}

	@When("verifyTitle")
	public void verify_title() {
		System.out.println("title is verified");
	   	}

	@Then("closeApplication")
	public void close_application() {
		driver.close();
		System.out.println("application is closed");
	   	}




}
