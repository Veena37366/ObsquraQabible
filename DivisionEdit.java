package QaBible;
import org.testng.annotations.Test;
import Utility.Readexcel;
import Utility.Util_lib;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DivisionEdit 
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
	  public void divisionEdit() throws IOException 
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
		  	By editButton= By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[6]/a[2]");
			obj.click(editButton);
			WebElement companyDropdown= driver.findElement(By.id("division-company_id"));
			Select companySel=new Select(companyDropdown);
			companySel.selectByVisibleText("obsqura123");
			WebElement branchDropdown= driver.findElement(By.id("division-branch_id"));
			Select branchSel=new Select(branchDropdown);
			branchSel.selectByVisibleText("tvm1");
			driver.findElement(By.xpath("//*[@id=\"division-division_name\"]")).clear();
			String dname=obj1.readexcel1(4,0);
			By divName=By.id("division-division_name");
			obj.sendKeys(divName,dname);
			By editBtn=By.xpath("//*[@id=\"w1\"]/div[5]/div/button");  	
		  	obj.click(editBtn,9);	
		  	System.out.println("Testcase passed");
			  
		  }
	  @AfterTest
	  public void afterTest() 
		  {
		  	driver.quit();
		  }
	
	}
