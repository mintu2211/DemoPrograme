package PrachiGupta;

import java.net.URL;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;

import org.apache.xerces.util.URI.MalformedURIException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().window().maximize();

		//find hyperlinks
		List<WebElement> linklist= driver.findElements(By.tagName("a"));

		int rescode=200;//2xx response code is valid link
		int brokenLinkcnt = 0;

		System.out.println("Total links on page:" +linklist);
		for (WebElement element : linklist) {

			String url=element.getAttribute("href");

			try {

				URL urlLink=new URL(url);
				HttpsURLConnection huc=(HttpsURLConnection)urlLink.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				rescode =huc.getResponseCode();
				if(rescode>=400)
				{
					System.out.println(url+ "broken link");
				}

			}

		
		catch (MalformedURIException e)
		{


		}
		catch(Exception e)
		{

		}

		System.out.println("Total broken links:" +brokenLinkcnt);

	}
}
}