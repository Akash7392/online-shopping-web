package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClassPackage.BaseClassForonlineShopping;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class Stepdefinitionclassweb extends BaseClassForonlineShopping
{
     
	BaseClassForonlineShopping bc= new BaseClassForonlineShopping();
	
//	@Before
//	public void launcing_brows() throws Throwable
//	{
//		   bc.webdrivercallingmethod();
//		   bc.web.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//		 bc.screenshotinweb(bc.web, "login to website");
//		
//		  bc.web.findElement(By.xpath("//input[@id='email_create' and @name='email_create']")).sendKeys("ak@gmail");
//			//  web.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//			  bc.screenshotinweb(bc.web, "Enter the emailid");
//			  bc.web.findElement(By.xpath("//button[@id='SubmitCreate' and @name='SubmitCreate']")).click();
//}

//@After
//public void quit_the_brows() 
//{
//  bc.web.quit();
//}

	
@Given("^enter personal details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")

public void enter_personal_details_and_and(String f_name, String L_name, String Paasword)
{
	//web.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	String exp="ak.yesankar@outlook.com";
	bc.web.findElement(By.xpath("//input[@id='customer_firstname' and @name='customer_firstname']")).sendKeys(f_name);
	bc.web.findElement(By.xpath("//input[@id='customer_lastname' and @name='customer_lastname']")).sendKeys(L_name);
	bc.web.findElement(By.xpath("//input[@id='passwd' and @name='passwd']")).sendKeys(Paasword);
	String act=bc.web.findElement(By.xpath("//input[@id='email' and @name='email']")).getText();
	
    if (exp.equals(act)==true)
    {
    	System.out.println("String are equala");
    }
}	

@Given("^Enter address mandatory details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_address_mandatory_details_and_and_and_and_and_and_and_and(String First_name, String Last_name, String city, String address, String state, String Zip_code, String country, String mob, String future_ref_add) 
{
	bc.web.findElement(By.xpath("//input[@id='firstname' and @class='form-control']")).sendKeys(First_name);
	bc.web.findElement(By.xpath("//input[@id='lastname' and @class='form-control']")).sendKeys(Last_name);
	bc.web.findElement(By.xpath("//input[@id='city' and @class='form-control']")).sendKeys(city);
	bc.web.findElement(By.xpath("//input[@id='address1' and @class='form-control']")).sendKeys(address);
	WebElement statedrp = bc.web.findElement(By.xpath("//select[@id='id_state' and @class='form-control']"));
               statedrp.sendKeys(state);
               
     bc.web.findElement(By.xpath("//input[@id='postcode' and @name='postcode']")).sendKeys(Zip_code);
	
 	WebElement countrydrp = bc.web.findElement(By.xpath("//select[@id='id_country' and @name='id_country']"));
 	 countrydrp.sendKeys(country);
 	

	bc.web.findElement(By.xpath("//input[@id='phone_mobile' and @name='phone_mobile']")).sendKeys(mob);
	bc.web.findElement(By.xpath("//input[@id='alias' and @value='My address']")).sendKeys(future_ref_add);
}

@And("^Enter the date of birth$")
public void enter_the_date_of_birth()
{
 	WebElement dob = bc.web.findElement(By.xpath("//select[@id='days' and @name='days']"));
 	dob.sendKeys("9");
 	
 	WebElement mon = bc.web.findElement(By.xpath("//select[@id='months' and @name='months']"));
 	mon.sendKeys("May");
 	
 	WebElement year = bc.web.findElement(By.xpath("//select[@id='years' and @name='years']"));
 	year.sendKeys("2018");
}

@And("^Click on check boxes sign up and receive special offer$")
public void click_on_check_boxes_sign_up_and_receive_special_offer() 
{
 bc.web.findElement(By.xpath("//input[@id='newsletter' and @value='1']")).click();
 bc.web.findElement(By.xpath("//input[@id='optin' and @value='1']")).click();
}


@And("^Enter the company name \"([^\"]*)\" and Address linetwo \"([^\"]*)\" and \"([^\"]*)\"$")
public void enter_the_company_name_and_Address_linetwo_and(String com_name, String Address_linetwo, String Additional_info)
{
	bc.web.findElement(By.xpath("//input[@id='company' and @class='form-control']")).sendKeys(com_name);
	bc.web.findElement(By.xpath("//input[@id='address2' and @class='form-control']")).sendKeys(Address_linetwo);
	bc.web.findElement(By.xpath("//textarea[@id='other' and @class='form-control']")).sendKeys(Additional_info);
}

@And("^Click on register process$")
public void click_on_register_process() throws Exception 
{
	  bc.screenshotinweb(bc.web, "before click on register button");
	 bc.web.findElement(By.xpath("//button[@id='submitAccount' and @name='submitAccount']")).click();
	// bc.screenshotinweb(bc.web, "After click on register button");
}

@Given("^click on title radio button mr and mrs$")
public void click_on_title_radio_button_mr_and_mrs()
{
 bc.web.findElement(By.xpath("//input[@id='id_gender1' and @value='1']")).click();
}

@Given("^Verify invalid email adress error$")
public void verify_invalid_email_adress_error() throws Exception
{
	bc.screenshotinweb(bc.web, "verifyemail eror message");
	String expt_err_message ="Invalid email address.";
    String act_err_message= bc.web.findElement(By.xpath("//div[@id='create_account_error']/ol/li")).getText();
    if(expt_err_message.equalsIgnoreCase(act_err_message)==true)
    {
    	System.out.println("error message is displaying correctly");
    }
    else
    	System.out.println("error message displaying is not correct");
 }

}
