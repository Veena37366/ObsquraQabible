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

public class NewCompanyCreation 
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
	  public void companyCreate() throws IOException 
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
		  	By companyCreate=By.xpath("/html/body/section/div/div/div[1]/ul/li[1]");
		  	obj.click(companyCreate, 3); 	
		  	String cname=obj1.readexcel1(1, 0);
			By compname=By.id("company-company_name");	
		  	obj.sendKeys(compname,cname);	
		  	String cemail=obj1.readexcel1(1,1);
			By compemail=By.id("company-company_email");
		  	obj.sendKeys(compemail,cemail);	
		  	String caddr=obj1.readexcel1(1,2);
			By compaddress=By.id("company-company_address");
		  	obj.sendKeys(compaddress,caddr);	
		  	String cdate=obj1.readexcel1(1,3);
		  	By companyDate=By.id("company-started_at");
		  	obj.sendKeys(companyDate, cdate);
		  	
		  	WebElement save= driver.findElement(By.xpath("//*[@id=\\\"w0\\\"]/div[6]/div/button"));		
		  	save.click(); 
		  	System.out.println("Testcase passed"); 	
//		  	By btn=By.xpath("//*[@id=\"w0\"]/div[6]/div/button");
//		  	obj.click(btn,3);
		  		
		  }
	  
	  @AfterTest
	  public void afterTest() 
		  {
			 driver.quit(); 
		  }
	
	}
