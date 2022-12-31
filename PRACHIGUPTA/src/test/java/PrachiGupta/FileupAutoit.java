package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileupAutoit {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//input[@id='file-upload']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(button).click().perform();
	//  Runtime.getRuntime().exec("C:\\Users\\Devendra\\Desktop\\Fileup.exe", + " " + "C:\\Users\\Devendra\\Desktop\\Book1.xlsx");
	}

}
