package PrachiGupta;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTab {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("First Page" +driver.getTitle());
		//opoen new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Second Page" +driver.getTitle());

	//get window handels for open windows
		Set<String> windowHandles=driver.getWindowHandles();
		List<String> handles=new ArrayList<String>();
		handles.addAll(windowHandles);
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println("first page" +driver.getTitle());
	
	}

}
