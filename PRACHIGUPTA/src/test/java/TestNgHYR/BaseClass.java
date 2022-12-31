package TestNgHYR;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();


	}

	@AfterTest
	public void teardown() {

		driver.quit();
	}
	
	

	public void TakeScreenShot(WebDriver driver, String screenshotname) throws Exception
	{
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File sourcefile=tsc.getScreenshotAs(OutputType.FILE);
		//File dest=new File("C:\\Users\\Devendra\\eclipse-workspace\\PRACHIGUPTA\\Screenshot\\test3.png");
		File destfile=new File("./Screenshot/"+ screenshotname+".png");
		FileUtils.copyFile(sourcefile, destfile);
		System.out.println("Screenshots saved succesfully");
	}
	
}
