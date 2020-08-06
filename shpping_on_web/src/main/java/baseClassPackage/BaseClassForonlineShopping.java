package baseClassPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class BaseClassForonlineShopping  

{
	public WebDriver web;
	public  Properties pop;
	public void webdrivercallingmethod()
	{
	try{
     pop = new Properties();
	File srcw = new File("C:\\Users\\Akash\\git\\online-shopping-web\\shpping_on_web\\propertiesfile\\all.properties");
    FileInputStream ins = new FileInputStream(srcw);
    pop.load(ins);
    }
catch (Exception e)
    {
	System.out.println("properties file not found");
    }
	
	System.setProperty("webdriver.chrome.driver","C:\\selenium project\\Selenium webdriver\\chromedriver_win32 (2)\\chromedriver.exe");
	web = new ChromeDriver();
	web.get(pop.getProperty("URL"));
	web.manage().window().maximize();
	web.manage().deleteAllCookies();
	web.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}	
	
	public void screenshotinweb(WebDriver g, String strname) throws IOException
	{
		TakesScreenshot ss = (TakesScreenshot)g;
		File fs = ss.getScreenshotAs(OutputType.FILE);
		File dn = new File("C:\\Users\\Akash\\git\\online-shopping-web\\shpping_on_web\\takescreenshot\\"+strname+".png");
		 FileUtils.copyFile(fs, dn);
	}
	
}
