package PrachiGupta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//button[@id='alert']")).click();
		//switch to allert window and accept the alert
		//driver.switchTo().alert().accept();

		//confirm alert
		//driver.findElement(By.xpath("//button[@id='confirm']")).click();
		//driver.switchTo().alert().dismiss();
		//driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//button[@id='prompt']")).click();
		driver.switchTo().alert().sendKeys("Mintu");
		driver.switchTo().alert().accept();
		driver.quit();
		
	}

}
