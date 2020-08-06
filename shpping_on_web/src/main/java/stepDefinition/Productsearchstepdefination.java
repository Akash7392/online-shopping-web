package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import baseClassPackage.BaseClassForonlineShopping;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Productsearchstepdefination extends BaseClassForonlineShopping
{
	String pd;
	String pdaftrsearch;
	BaseClassForonlineShopping ps= new BaseClassForonlineShopping();
	
	@Before
	public void launcing_browsforprod() throws Throwable
	{
		   ps.webdrivercallingmethod();
	}	
	
	@After
	public void quit_the_brows() 
	{
	  ps.web.quit();
	}
	
	@Given("^Move the cursor over women menu and click on t shrits option$")
	public void move_the_cursor_over_women_menu_and_click_on_t_shrits_option()
	{
		WebElement mhps= ps.web.findElement(By.xpath("//a[@class='sf-with-ul' and @title='Women']"));
		
	   Actions actp = new Actions(ps.web);
	   actp.moveToElement(mhps).build().perform();
	   ps.web.findElement(By.xpath("//ul[@style='display: none;']/li/a[@title='T-shirts']")).click();
    }

	@When("^Get the name of first product displayed on the page$")
	public void get_the_name_of_first_product_displayed_on_the_page() 
	{
	    pd=ps.web.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText();
	}
	@Then("^Now enter the same product name in the search bar present on top of page and click search button$")
	public void now_enter_the_same_product_name_in_the_search_bar_present_on_top_of_page_and_click_search_button() 
	{
		 ps.web.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(pd);
		 ps.web.findElement(By.xpath("//button[@name='submit_search']")).click();
		 pdaftrsearch=ps.web.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText();
	}	
	
	@Then("^Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page$")
	public void validate_that_same_product_is_displayed_on_searched_page_with_same_details_which_were_displayed_on_T_Shirt_s_page() 
 {
	if(pd.equals(pdaftrsearch)==true)
	{
		System.out.println("product details same");
	}
	else
	{
		System.out.println("product details not same");
	}

 }	
	
	
}
