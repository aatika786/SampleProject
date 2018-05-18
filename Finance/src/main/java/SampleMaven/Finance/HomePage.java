package SampleMaven.Finance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement email;
	@FindBy(id="passwd")WebElement passwd;
	@FindBy(id="SubmitLogin")WebElement submitLogin;
	@FindBy(xpath="//h1[text()='My account']")WebElement verifyAccount;

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
/**
 * @author Aatika
 * 
 */
public void login()
{
	
	signIn.click();
	email.sendKeys("qatest@gmail.com");
	passwd.sendKeys("password");
	submitLogin.click();
}


public String verifyLoginPage()
{
	return verifyAccount.getText();
}

}
