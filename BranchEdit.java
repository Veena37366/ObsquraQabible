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

public class BranchEdit 
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
	  public void branchEdit() throws IOException 
		  {
		  	String uName=obj1.readexcel1(0, 0);
		  	String pwd=obj1.readexcel1(0, 1);
		  	By Username= By.id("loginform-username");
		  	By password= By.id("loginform-password");
		  	By loginBtn=By.name("login-button");  	
		  	By companyBtn=By.xpath("//*[@id=\"w1\"]/li[2]");
		  	obj.sendKeys(Username, uName);
		  	obj.sendKeys(password, pwd);
		  	obj.click(loginBtn, 6);	
		  	obj.click(companyBtn, 6);
		  	By branchCreate=By.xpath("/html/body/section/div/div/div[1]/ul/li[2]/a");
		  	obj.click(branchCreate, 5);
		  	By editButton= By.xpath("//*[@id=\"w0\"]/table/tbody/tr[1]/td[5]/a[2]");
			obj.click(editButton);
			By branch= By.id("branch-company_id");
			obj.click(branch);
			WebElement branchDropdown= driver.findElement(By.id("branch-company_id"));
			Select branchSel=new Select(branchDropdown);
			branchSel.selectByVisibleText("obsqura123");
			driver.findElement(By.xpath("//*[@id=\"branch-branch_name\"]")).clear();
			String bname=obj1.readexcel1(3,0);
			By branchName=By.id("branch-branch_name");
			obj.sendKeys(branchName,bname);	
			driver.findElement(By.id("branch-branch_address")).clear();
		  	String baddr=obj1.readexcel1(3,1);
			By branchAddress=By.id("branch-branch_address");
		  	obj.sendKeys(branchAddress,baddr);
		  	By editBtn=By.xpath("//*[@id=\"w1\"]/div[5]/div/button");  	
		  	obj.click(editBtn);	
		  	System.out.println("Testcase passed");
		  	
		  }
	  @AfterTest
	  public void afterTest() 
		  {
			  driver.quit();
		  }
	
	}
