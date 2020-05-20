package QaBible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utility.Qabible_Utility;

public class Login 
	{
	static WebDriver driver;
	public static void main(String[] args) 	
		{		
			Qabible_Utility obj=new Qabible_Utility();
			driver= obj.browserLaunge("chrome","http://qabible.in/payrollapp/");
			WebElement username= driver.findElement(By.id("loginform-username"));
			username.sendKeys("carol");
			WebElement password= driver.findElement(By.id("loginform-password"));
			password.sendKeys("1q2w3e4r");
			WebElement login= driver.findElement(By.name("login-button"));		
			login.click();
			System.out.println("Login Successfully Completed");	
		}	
	}
