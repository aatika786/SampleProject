package SampleMaven.Finance;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterClass;

public class SampleTestNG extends webdriver
{

  
  @BeforeClass
  @Parameters("browser")
  public void startProcess(String browser) throws Exception 
  {
  browserLaunch(browser, getData("eenaduurl"));
  }

  
  @Test
  public void f() {
  }
  
  @AfterClass
  public void afterClass() {
  }

}
