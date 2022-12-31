package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {


	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();



		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);	

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		WebElement date=driver.findElement(By.xpath("//div[@class='dateInnerCell']"));
	    String dateval="30";
	}

	public static void selectDateByJS(	WebDriver driver, WebElement elements, String dateval)
	{
	
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments(0).setAttributes('value','" +dateval+ "');", elements );
	
	
        
	}

}
