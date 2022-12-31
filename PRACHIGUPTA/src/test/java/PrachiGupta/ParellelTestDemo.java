package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelTestDemo {


	WebDriver driver;
	@Test
	public void verifytitle()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		Assert.assertEquals(driver.getTitle(), "Swag Labs");	

		driver.quit();
	}

	@Test
	public void verifyLogo()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");

		//Assert.assertEquals(driver.getTitle(), "Swag Labs");	
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
		driver.quit();
	}

}
