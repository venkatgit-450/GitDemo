package stepDefinations;

import java.sql.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepDefination  {
  BaseClass b=new BaseClass();
	@Given("^Open Browser$")
	public void open_Browser() throws Throwable {
	 b.openBrowser("chrome");
	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
		
      	   
	}

	@Given("^Click on login link in hpome page to land on Secure sign in page$")
	public void click_on_login_link_in_hpome_page_to_land_on_Secure_sign_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@When("^uesr enters \"([^\"]*)\" and \"([^\"]*)\" and logged in$")
	public void uesr_enters_and_and_logged_in(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^verify that user is successfully logged in$")
	public void verify_that_user_is_successfully_logged_in() throws Throwable {
	   
	}

}