package PrachiGupta;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		
		WebElement elements=driver.findElement(By.id("input-country"));
		
		org.openqa.selenium.support.ui.Select dropdown=new org.openqa.selenium.support.ui.Select(elements);
		
		//dropdown.selectByVisibleText("India");
		//dropdown.selectByValue("98");
		dropdown.selectByIndex(3);
		
		if(dropdown.isMultiple())
		{
			System.out.println("Dropdown is Multiple Selection");
		}
		else
		{
			System.out.println("Dropdown is not multiple Selection");
		}
		List<WebElement> alloption=dropdown.getOptions();
	
		System.out.println("Total number of option " +alloption.size());
		for (WebElement all : alloption) {
			System.out.println(all.getText());
		
		}
	}

}
