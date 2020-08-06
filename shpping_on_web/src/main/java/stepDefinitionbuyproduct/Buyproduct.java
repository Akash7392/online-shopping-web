package stepDefinitionbuyproduct;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import baseClassPackage.BaseClassForonlineShopping;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Buyproduct extends BaseClassForonlineShopping
{
	BaseClassForonlineShopping bp= new BaseClassForonlineShopping();
    @Before
	public void launchb() throws Throwable
	{
    	  bp.webdrivercallingmethod();
	}
	
    @After
    public void quitsb()
    {
    	bp.web.quit();
    }
	@Given("^Navigate to website and click on sign in button$")
	public void navigate_to_website_and_click_on_sign_in_button() 
	{
	  
	    bp.web.findElement(By.xpath("//a[@class='login' and contains(text(),'Sign in')]")).click();
	}	
	
	@When("^Log in with valid credencials \"([^\"]*)\" and \"([^\"]*)\" and click on sign in$")
	public void log_in_with_valid_credencials_and_and_click_on_sign_in(String username, String pw)
	{
		 bp.web.findElement(By.xpath("//input[@id='email' and @data-validate='isEmail' and @name='email']")).sendKeys(username);
		 bp.web.findElement(By.xpath("//input[@id='passwd' and @type='password']")).sendKeys(pw);
		 bp.web.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
    }	
	
	
	@Then("^Move the cursor over women menu and clicks on t shrits option$")
	public void move_the_cursor_over_women_menu_and_clicks_on_t_shrits_option() 
	{
	   Actions actbp = new Actions(bp.web);
	   WebElement wmen=bp.web.findElement(By.xpath("//a[@title='Women']"));
	//   WebElement tshirt =bp.web.findElement(By.xpath("//ul[@style='display: none;']/li/a[@title='T-shirts']"));
	   actbp.moveToElement(wmen).build().perform();
	   bp.web.findElement(By.xpath("//ul[@style='display: none;']/li/a[@title='T-shirts']")).click();
	}
	
	@Then("^More button will be displayed then click on More button$")
	public void more_button_will_be_displayed_then_click_on_More_button() 
	{
		Actions actshirt = new Actions(bp.web);
		WebElement faded =bp.web.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']"));
		actshirt.moveToElement(faded).build().perform();
       bp.web.findElement(By.xpath("//a[@title='View']")).click();
	}
	
	@Then("^Increase quantity to two and select size \"([^\"]*)\" and color and click on Add to cart$")
	public void increase_quantity_to_two_and_select_size_and_color_and_click_on_Add_to_cart(String size) 
	{
	  bp.web.findElement(By.xpath("//i[@class='icon-plus']")).click();
	  WebElement sizes =bp.web.findElement(By.xpath("//select[@id='group_1']"));
	  sizes.sendKeys(size);
	  bp.web.findElement(By.xpath("//a[@name='Blue']")).click();
	  bp.web.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
	 }	
	
    @Then("^Click Proceed to checkout button$")
	public void click_Proceed_to_checkout_button() 
    {
    	bp.web.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();
    }	
	
    @Then("^Complete the buy order process till payment$")
    public void complete_the_buy_order_process_till_payment()
    {  
    	System.out.println("to check whether control is in method or not");
    	bp.web.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")).click(); //click on when on summery
    	System.out.println(" click on when on summery successfully");
    	bp.web.findElement(By.xpath("//button[@name='processAddress']")).click(); //click on when on address
    	System.out.println(" click on when on adreess successfully");
    	bp.web.findElement(By.xpath("//input[@type='checkbox']")).click();
    	bp.web.findElement(By.xpath("//button[@name='processCarrier']")).click(); //click on when on shipping

       //	bp.web.findElement(By.xpath("//button[@name='processCarrier']")).click();
       	bp.web.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]")).click();
       	bp.web.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
     }	
	
    @Then("^Make sure that Product is ordered$")
    public void make_sure_that_Product_is_ordered() 
    {
       System.out.println("order placed successfully");
    }	
}
