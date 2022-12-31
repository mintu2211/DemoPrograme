package PrachiGupta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar {

	public static void main(String[] args) throws Exception{

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		System.out.println("this is fine so far ");
		//1.How to select validate the user input 
		//2.Select a date in the current year and current month 
		//3. Select the past date .
		
		//4.Select the future date 
		//Create a utility function for handling calendars
    java.util.Calendar calendar=java.util.Calendar.getInstance();
		String targetdate="28-Feb-2023";
		SimpleDateFormat targetdateformate=new SimpleDateFormat("dd-MMM-yyyy");
		targetdateformate.setLenient(false);
		Date formatteddate;

		formatteddate = targetdateformate.parse(targetdate);
		calendar.setTime(formatteddate);
		
		int targetDay=calendar.get(calendar.DAY_OF_MONTH);
		int targetMonth=calendar.get(calendar.MONTH);
		int targetyear=calendar.get(calendar.YEAR);
		
		driver.findElement(By.id("second_date_picker")).click();
		System.out.println(formatteddate);
	}

}
