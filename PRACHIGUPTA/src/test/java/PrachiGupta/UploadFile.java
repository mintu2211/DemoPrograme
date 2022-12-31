package PrachiGupta;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		//	driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\Devendra\\Desktop\\Book1.xlsx");
		WebElement	button=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		Actions act=new Actions(driver);
		act.moveToElement(button).click().perform();


		//driver.quit();

		Robot rb=new Robot();
		rb.delay(2000);
		//copy file path in clipboard we use Stringselection class
		StringSelection ss=new StringSelection("C:\\Users\\Devendra\\Desktop\\Book1.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//perform control +V action to paste file 
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		driver.quit();


	}

}
