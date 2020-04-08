package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class stepDefination  {
	WebDriver driver;
	


@Given("^Open Browser$")
public void open_Browser() throws Throwable {
	System.setProperty("webdriver.chrome.driver","D:\\Browser Drivers\\ChromeDriverwin32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
   
}
@Given("^open URL \"([^\"]*)\" site$")
public void open_URL_site(String arg1) throws Throwable {
   
	
	 driver.get(arg1);
 
}
@Given("^Click on login link in hpome page to land on Secure sign in page$")
public void click_on_login_link_in_hpome_page_to_land_on_Secure_sign_in_page() throws Throwable {
	 driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span")).click();	
	 //driver.switchTo().alert().dismiss();
}

@When("^uesr enters \"([^\"]*)\" and \"([^\"]*)\" and logged in$")
public void uesr_enters_and_and_logged_in(String arg1, String arg2) throws Throwable {
    driver.findElement(By.name("user[email]")).sendKeys(arg1);
    driver.findElement(By.name("user[password]")).sendKeys(arg2);
    driver.findElement(By.name("commit")).click();

}

@Then("^verify that user is successfully logged in$")
public void verify_that_user_is_successfully_logged_in() throws Throwable {
   if( driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/a/span")).isDisplayed())
   {
	   System.out.println("logged in successfully");
   }
   else 
   {
	   System.out.println("not logged in the site");
   }
    driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/a/span")).click();
    Actions a=new Actions(driver);
	WebElement LogOut=driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[5]/a"));
	a.moveToElement(LogOut).build().perform();
    driver.findElement(By.xpath("/html/body/header/div[2]/div/div/div[2]/nav/div[2]/ul/li[9]/ul/li[5]/a")).click(); 
    driver.close();

	 
}


}