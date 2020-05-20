package QaBible;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CompanyEntry 
	{
		
		static WebDriver driver;
		public static void main(String[] args) 
			{
				System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("http://qabible.in/payrollapp/company/index");
				driver.manage().window().maximize();
				WebElement username= driver.findElement(By.id("loginform-username"));
				username.sendKeys("carol");
				WebElement password= driver.findElement(By.id("loginform-password"));
				password.sendKeys("1q2w3e4r");
				WebElement login= driver.findElement(By.name("login-button"));		
				login.click();
				driver.navigate().to("http://qabible.in/payrollapp/company/index");
				//WebElement companyMenu= driver.findElement(By.xpath("//*[@id=\"w1\"]/li[2]/a"));		
				//companyMenu.click();		
				WebElement companyName= driver.findElement(By.id("company-company_name"));		
				companyName.sendKeys("Obsqura Zone");			
				WebElement companyEmail= driver.findElement(By.id("company-company_email"));		
				companyEmail.sendKeys("obsqurazone123@gmail.com");				
				WebElement companyAddress= driver.findElement(By.id("company-company_address"));		
				companyAddress.sendKeys("obsqurazone TVM,Kazhakkoottam");	
			
			}
	
	}
