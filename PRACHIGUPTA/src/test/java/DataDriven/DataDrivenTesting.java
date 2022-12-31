package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "loginData", dataProviderClass = ReadExcelfile2.class)
	public void Logintest(String username, String password)
	{
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		
	}
	/*@DataProvider(name = "logindata")
	public String [][] getData() throws Exception
	{
		String loginData[][]= {
				{"standard_user","secret_sauce"},
				{"locked_out_user","secret_sauce"},
				{"locked_out_user","secret_sauc"}		
		};
		
		
	}*/
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	

}
