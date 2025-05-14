package Stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class datatable {
	
	WebDriver driver ;
	@Given("User open Registration account page")
    public void user_open_registration_account_page() throws Exception 
    {
       driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
       Thread.sleep(5000);
    }
	
	@When("User enter below details")
    public void user_enter_below_details(DataTable dataTable) throws Exception  
    {
        Map<String,String> map =dataTable.asMap(String.class,String.class);        
        
       
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys(map.get("firstname"));
        Thread.sleep(5000);
        driver.findElement(By.name("lastname")).sendKeys(map.get("lastname"));
        Thread.sleep(5000);
        driver.findElement(By.name("email")).sendKeys(map.get("emailaddress"));
        Thread.sleep(5000);
        driver.findElement(By.name("telephone")).sendKeys(map.get("telophone"));
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys(map.get("password"));
        }
	
	@When("Select Privacy policy field")
    public void select_privacy_policy_field()
    {
       
    }
	
	@When("click on continue button")
    public void click_on_continue_button() 
    {
       System.out.println("click on continue button");
    }
	
	@Then("account should get successfully generated")
    public void account_should_get_successfully_generated() 
    {
           System.out.println("account generated");
    }
	
}
