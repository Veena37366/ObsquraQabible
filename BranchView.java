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

public class BranchView 
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
	  
	  @Test
	  public void branchView() throws IOException 
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
		  	obj.click(branchCreate, 5); 
		  	By viewButton= By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]/a[1]");
			obj.click(viewButton);	
			WebElement companyName= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[1]/td"));
			String str1= companyName.getText();
			WebElement branchName= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[2]/td"));
			String str2= branchName.getText();
			WebElement createdBy= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[6]/td"));
			String str3= createdBy.getText();		
			if(str1.equals("obsqura123") && str2.equals("Eastbourne   City") && str3.equals("carol"))
			
				{
					System.out.println("Testcase Passed");
				}
			else
				{
					System.out.println("Testcase Failed");
				}	
		  }
	  @AfterTest
	  public void afterTest() 
		  {
			  driver.quit();
		  }
	
	}
