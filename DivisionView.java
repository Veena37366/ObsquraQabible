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

public class DivisionView 
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
		  public void divisionView() throws IOException 
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
			  	By Division=By.xpath("/html/body/section/div/div/div[1]/ul/li[3]");
			  	obj.click(Division, 3);
			  	By viewButton= By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[6]/a[1]");
				obj.click(viewButton);
				WebElement divisionName= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[1]/td"));
				String str1= divisionName.getText();
				WebElement branchName= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[2]/td"));
				String str2= branchName.getText();
				WebElement companyName= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[3]/td"));
				String str3= companyName.getText();
				WebElement createdBy= driver.findElement(By.xpath("//*[@id=\"w1\"]/tbody/tr[6]/td"));
				String str4= createdBy.getText();
				if(str1.equals("weq") && str2.equals("Tech") && str3.equals("obsqura123") && str4.equals("carol")) 
					{
						System.out.println("Testcase Passed");
						
					}
				else
					{
						System.out.println("Testcase fail");
					}
			  	
			  }
		  
		
		  @AfterTest
		  public void afterTest() 
			  {
			  driver.quit();
			  }
		
	}
