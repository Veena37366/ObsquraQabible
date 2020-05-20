package QaBible;

import org.testng.annotations.Test;

import Utility.Qabible_Utility;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class LoginForm 
	{
		 static WebDriver driver;  
		 @BeforeTest
		  public void beforeTest() 
			  {
				 	Qabible_Utility obj=new Qabible_Utility();
					driver= obj.browserLaunge("chrome","http://qabible.in/payrollapp/");
			  }
		
		 
		  @Test(priority=1)
		  public void LoginTest1() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carol1");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4r");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Invalid Usernmae");	 
			  }
		  
		  @Test(priority=2)
		  public void LoginTest2() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carol");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4rwqe");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Invalid Password");	 
			  }
		  
		  @Test(priority=3)
		  public void LoginTest3() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carolweqw");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4rwqe");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Invalid Username and Password");	 
			  }
	
		  @Test(priority=4)
		  public void LoginTest4() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4r");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Blank username");	 
			  }
	
		  
		  @Test(priority=5)
		  public void LoginTest5() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4r5");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Blank Username and invalid password");	 
			  }
		  
		  @Test(priority=6)
		  public void LoginTest6() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carol");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Blank password");	 
			  }
		  
		  @Test(priority=7)
		  public void LoginTest7() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carol1");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Invalid username and Blank password");	 
			  }
		  
		  @Test(priority=8)
		  public void LoginTest8() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					username.clear();
					password.clear();
					System.out.println("Blank username and Blank password");	 
			  }
		  
		  @Test(priority=9)
		  public void LoginTest9() 
			  {
				  	WebElement username= driver.findElement(By.id("loginform-username"));
					username.sendKeys("carol");
					WebElement password= driver.findElement(By.id("loginform-password"));
					password.sendKeys("1q2w3e4r");
					WebElement login= driver.findElement(By.name("login-button"));		
					login.click();
					
			  }
		  
		
		  @AfterTest
		  public void afterTest() 
			  {
			  		driver.quit();
			  }
	
	}
