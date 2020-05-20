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

public class DivisionCreation 
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
  public void divisionCreate() throws IOException 
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
	  	By SelectDropdown= By.id("division-company_id");
		obj.click(SelectDropdown);
		WebElement dropdown= driver.findElement(By.id("division-company_id"));
		Select dropselection= new Select(dropdown);
		dropselection.selectByIndex(1);	
		By divisionId= By.id("division-branch_id");
		obj.click(divisionId);
		WebElement divisionDropdown= driver.findElement(By.id("division-branch_id"));
		Select divSel=new Select(divisionDropdown);
		divSel.selectByVisibleText("tvm1");		
		String divName=obj1.readexcel1(0, 2);
		By divisionName=By.id("division-division_name");
	  	obj.sendKeys(divisionName, divName); 	
	  	By SaveBtn=By.xpath("//*[@id=\"w1\"]/div[5]/div/button");  	
	  	obj.click(SaveBtn, 1);
	  	System.out.println("Testcase passed");
	  }
  		
  @AfterTest
  public void afterTest() 
	  {
		  driver.quit();
	  }

}
