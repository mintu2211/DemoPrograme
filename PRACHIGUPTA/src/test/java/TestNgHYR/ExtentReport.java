package TestNgHYR;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport extends BaseClass implements ITestListener{
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;

	public void configurationReport()
	{

		//ReadConfig readconfig=new ReadConfig();
		String timestamp = new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String reportName = "MyStoreTestReport" + timestamp + ".html";
		htmlReporter=new ExtentSparkReporter(System.getProperty("user.dir") + "//Extent-Report//" + reportName);
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);

		//add system info 
		reports.setSystemInfo("Machine", "DevendraPC1");
		reports.setSystemInfo("os", "window 8");
		//reports.setSystemInfo("Browser", "chrome");
		//reports.setSystemInfo("Browser",readconfig.getBrowser());
		reports.setSystemInfo("username", "Devendra");

		//configuration 
		htmlReporter.config().setDocumentTitle("Extent Listener Report Demo");
		htmlReporter.config().setReportName("This is my first report");
		htmlReporter.config().setTheme(Theme.DARK);
		//isme time stamp nahi liya hai

	}



	//(1) onstart method is called when any test starts.
	public void onStart(ITestContext Result)
	{
		configurationReport();
		System.out.println("on start method is invoked");
	}

	//(2) onfinish method is called after all test are executed
	public void onFinish(ITestContext Result)
	{
		System.out.println("on finish method invoked");
		reports.flush();
		//it is mendatory to call flush method to ensure information is written to the started reporter

	}

	//(3) when test case get failed,this method is called 
	public void onTestFailure(ITestResult Result)
	{
		String base64code = null;
		try {
			base64code = capturScreenshot(base64code);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Name of test method failed " +Result.getName());
		test=reports.createTest(Result.getName())
		.addScreenCaptureFromBase64String(base64code);
		test.log(Status.FAIL, MarkupHelper.createLabel("Name of TestCases is" +Result.getName(), ExtentColor.RED));

		String screenshotpath=System.getProperty("user.dir") + "\\Screenshot\\" + Result.getName() + ".png";
		File screenshotfile=new File(screenshotpath);
		
	
		
		if(screenshotfile.exists())
		{
			
			
			test.fail("captured screenshot is below" +test.addScreenCaptureFromPath(screenshotpath));
			//test.fail("captured screenshot is below" +test.addScreenCaptureFromBase64String(base64code));
		}

		//test.addScreenCaptureFromPath(null)


	}

	//(4) when test case get skipped,this method is called 
	public void onTestSkipped(ITestResult Result)
	{
		
		System.out.println("Name of test method skipped " +Result.getName());
		test=reports.createTest(Result.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel("Name of TestCases is" +Result.getName(), ExtentColor.YELLOW));
	}


	//(5) when on test case get started, this method is called
	public void onTestStart(ITestResult Result)
	{
		System.out.println("Name of the method started:" +Result.getName() );

	}

	//(6) when test case get passed,this method is called 
	public void onTestSuccess(ITestResult Result)
	{
		System.out.println("Name of test method Success " +Result.getName());
		test=reports.createTest(Result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel("Name of TestCases is" +Result.getName(), ExtentColor.GREEN));
	
		
	}

	//(7) when test case onTestfailureButWithinSuccessPercentage,this method is called 
	public void onTestfailureButWithinSuccessPercentage(ITestResult Result)
	{

	}

	public static String capturScreenshot(String filename) throws IOException
	{
		TakesScreenshot takescreenshot=(TakesScreenshot)driver;
		File sourcefile = takescreenshot.getScreenshotAs(OutputType.FILE);
		 // File destfile = new File("./Screenshot/"+ filename+ ".png");
		File destfile = new File(System.getProperty("user.dir") + ".\\Screenshot\\" + filename + ".png");
		FileUtils.copyFile(sourcefile, destfile);
		//System.out.println("Screenshot saved sucessfully");
		return destfile.getAbsolutePath();
	}




}
