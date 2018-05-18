package SampleMaven.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.server.browserlaunchers.BrowserLauncher;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC001_LoginPage extends webdriver
{
  
  @BeforeClass
  @Parameters("browser")
  public void SetUp(String browser) throws Exception
  {
	  browserLaunch(browser, getData("ecommerceurl"));
  }

  @Test
  public void customerLogin() 
  {
	  HomePage page=new HomePage(driver);
	  page.login();
	  Assert.assertTrue(page.verifyLoginPage().equalsIgnoreCase("My account"));
	  
  }
  
  @AfterClass
  public void KillProcess() 
  {
	  
  }

}
