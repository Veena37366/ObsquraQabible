package QaBible;

import org.testng.annotations.Test;

import Utility.Readexcel;
import Utility.Util_lib;

import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class BranchPagination 
	{
	  static WebDriver driver;
	  Util_lib obj=new Util_lib();
	  Readexcel obj1=new Readexcel();
	  @BeforeTest
	  public void beforeTest() throws IOException 
		  {
			  String sample=obj1.readexcel1(0, 0);
			  driver= obj.browserLaunge("chrome",sample);     
		  }
	  @Test(priority=1)
	  public void branchPagination() throws IOException 
		  {
		  	String uName=obj1.readexcel1(0, 0);
		  	String pwd=obj1.readexcel1(0, 1);
		  	By Username= By.id("loginform-username");
		  	By password= By.id("loginform-password");
		  	By loginBtn=By.name("login-button");  	
		  	By companyBtn=By.xpath("//*[@id=\"w1\"]/li[2]");
		  	obj.sendKeys(Username, uName);
		  	obj.sendKeys(password, pwd);
		  	obj.click(loginBtn, 3);	
		  	obj.click(companyBtn, 3);
		  	By branchCreate=By.xpath("/html/body/section/div/div/div[1]/ul/li[2]/a");
		  	obj.click(branchCreate, 3);
			By page1= By.linkText("1");
			obj.click(page1);
			WebElement firstTD= driver.findElement(By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[1]"));
			String str1= firstTD.getText();
			WebElement lastTD= driver.findElement(By.xpath("//*[@id=\"w0\"]/table/tbody/tr[20]/td[1]"));
			String str2= lastTD.getText();
			if(str1.equals("1") && str2.equals("20"))
				{
					System.out.println("Testcase passed");
				}
			else
				{
					System.out.println("Testcase failed");
				}

		  }
	  
	
	  @AfterTest
	  public void afterTest() 
		  {
			  driver.quit();
		  }
	
	}
