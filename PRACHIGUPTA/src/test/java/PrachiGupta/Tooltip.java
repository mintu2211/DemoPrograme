package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//Thread.sleep(8000);
		//Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		//String	actualtooltip=driver.findElement(By.id("//input[@id='age']")).getAttribute("title");
		String	actualtooltip=driver.findElement(By.id("//input[@id='age']")).getAttribute("title");
		// getAttribute method return String value
	   
		String expectedTooltip="We ask for your age only for statistical purposes.";
	
	    if(actualtooltip.equals(expectedTooltip))
	    {
	    	System.out.println("Test passed");
	    }
	    else
	    {
	    	System.out.println("test failed");
	    }
	}

}
