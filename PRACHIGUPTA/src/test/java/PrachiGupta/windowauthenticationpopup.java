package PrachiGupta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowauthenticationpopup {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//after https:// we give userid: password
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
