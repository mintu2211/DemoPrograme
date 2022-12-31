package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {
	
	
	@Test(dataProvider = "searchDataSet",dataProviderClass = DataProviderMethod.class)
	public void TestCaseGooglesearch(String country, String monument)
	{
		//launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//open url
		driver.get("https://www.google.com/");
		WebElement searchbox=driver.findElement(By.name("q"));
		
		searchbox.sendKeys(country + " "+ monument);
		driver.findElement(By.name("btnK")).submit();
	}	

}
