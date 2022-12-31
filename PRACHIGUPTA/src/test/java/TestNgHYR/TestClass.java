package TestNgHYR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {
	@Test(retryAnalyzer = Iretry.class)
	public void GoogleTest() throws Exception  {
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Devendra", Keys.ENTER );
		String expectedTitle ="Devendra - Google Searc";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
		//Assert.fail();
	}
	
	@Test
	public void method1()
	{
		System.out.println("This is method 1");
		Assert.assertEquals(true,true);
	}
	
	@Test
	public void method2()
	{
		System.out.println("This is method 2");
		Assert.assertEquals(true,true);
	}
	
	BaseClass bc=new BaseClass();
	@org.testng.annotations.AfterMethod
	public void AfterMethod(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			bc.TakeScreenShot(driver, result.getName());
		}
	}



	
}
