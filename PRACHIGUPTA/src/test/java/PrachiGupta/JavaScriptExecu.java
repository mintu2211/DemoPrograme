package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecu {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Inside  javascriptexecutor  's'are in small 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("document.getElementByXpath('//input[@name='q']').value='mintu';");
	
		
		 WebElement element=driver.findElement(By.xpath("//input[@name='btnK']"));
         js.executeScript("arguments[0].click();", element);
	}

}
