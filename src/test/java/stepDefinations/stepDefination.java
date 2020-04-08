package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepDefination  {
	WebDriver driver;


@Given("^Open Browser$")
public void open_Browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}
@Given("^open URL \"([^\"]*)\" site$")
public void open_URL_site(String arg1) throws Throwable {
   
	System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\ChromeDriverwin32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get(arg1);
 
}
@Given("^Click on login link in hpome page to land on Secure sign in page$")
public void click_on_login_link_in_hpome_page_to_land_on_Secure_sign_in_page() throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span")).click();	   
}

@When("^uesr enters \"([^\"]*)\" and \"([^\"]*)\" and logged in$")
public void uesr_enters_and_and_logged_in(String arg1, String arg2) throws Throwable {
    driver.findElement(By.name("user[email]")).sendKeys(arg1);
    driver.findElement(By.name("user[password]")).sendKeys(arg2);
    driver.findElement(By.name("commit")).click();

}

@Then("^verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}


}