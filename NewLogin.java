package QaBible;

import org.testng.annotations.Test;

import Utility.Qabible_Utility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class NewLogin {
	
	static WebDriver driver; 
	@BeforeTest
	public void beforeTest() 
		{
			Qabible_Utility obj=new Qabible_Utility();
			driver= obj.browserLaunge("chrome","http://qabible.in/payrollapp/");
 
		}	
  @Test(priority=1)
  public void loginTest() 
	  {
		  	WebElement username= driver.findElement(By.id("loginform-username"));
			username.sendKeys("carol");
			WebElement password= driver.findElement(By.id("loginform-password"));
			password.sendKeys("1q2w3e4r");
	//		String str1=username.getText();
	//		String str2=password.getText();
			WebElement login= driver.findElement(By.name("login-button"));		
			login.click(); 
			System.out.println("Test case passed");	
	  }
 

  @AfterTest
  public void afterTest() 
	  {
		  driver.quit();
	  }

}
