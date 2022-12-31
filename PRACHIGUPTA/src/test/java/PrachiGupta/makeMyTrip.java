package PrachiGupta;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makeMyTrip {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]")).click();

		Thread.sleep(5000);
		System.out.println("test is passed ");
		driver.findElement(By.xpath("//div[@class='DayPicker-Day'][contains(@aria-label,'Sat Dec 17 2022')]")).click();
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Devendra\\eclipse-workspace\\PRACHIGUPTA\\Screenshot\\date.png");
		FileUtils.copyFile(src, dest);
		System.out.println("test passed");
	}

}
