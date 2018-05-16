package SampleMaven.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class LinkTesting extends webdriver
{
  
  
  @BeforeMethod
  @Parameters("browser")
  
  public void startprocess(String browser) throws Exception 
  {
	  if(browser.equalsIgnoreCase("CHROME"))
	  browserLaunch(getData("browser"), getData("flipkarturl"));
	  {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
	  	if(browser.equalsIgnoreCase("FIREFOX"))
		browserLaunch(getData("browser"), getData("flipkarturl"));
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		if(browser.equalsIgnoreCase("IE"))
			browserLaunch(getData("browser"), getData("flipkarturl"));
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
	    
		driver.get(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
  }
  


	



@Test
  public void linktesting() 
  {
	  driver.findElement(By.linkText("Login & Signup")).click();
  }
  
  
  
  @AfterMethod
  public void killprocess() 
  {
	  driver.close();
  }

}
