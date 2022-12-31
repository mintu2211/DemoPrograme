package PrachiGupta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		//for how many link present in page
	List<WebElement> linklist=driver.findElements(By.tagName("a"));
	System.out.println("Total links on webpages" +linklist.size());
	
	//for print link text
	for (WebElement e : linklist) {
		
		System.out.println(e);
	}
	}

}
