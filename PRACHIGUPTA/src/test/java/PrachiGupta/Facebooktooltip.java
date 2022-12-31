package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooktooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	String actualtooltip=driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[1]/a")).getAttribute("title");
	String expectedtooltip="Sign up for Facebook";
	if(actualtooltip.equals(expectedtooltip))
	{
		System.out.println("test is passed");
	}
		
	else
	{
		System.out.println("test is failed");
	}
	}

}
