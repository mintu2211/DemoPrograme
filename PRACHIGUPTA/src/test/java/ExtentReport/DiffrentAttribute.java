package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DiffrentAttribute {

	public static void main(String[] args) throws IOException {

		ExtentReports extentReport = new ExtentReports();
		File file=new File("reportattribute.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReport.attachReporter(sparkReporter);

		extentReport
		.createTest("Test1")
		.assignAuthor("Devendra")
		.assignCategory("Smoke")
		.assignDevice("chrome 99")
		.pass("This is a passed test");


		extentReport
		.createTest("Test2")
		.assignAuthor("Sanjeev")
		.assignCategory("Sanity")
		.assignDevice("edge 99")
		.fail("this is a failed test");
		
		extentReport
		.createTest("Test3")
		.assignAuthor("Sanjeev")
		.assignCategory("Regression")
		.assignDevice("firefox 99")
		.fail("this is a failed test");
		
		extentReport
		.createTest("Test4")
		.assignAuthor("Sanjeev")
		.assignAuthor("Devendra")
		.assignCategory("Smoke")
		.assignCategory("Sanity")
		.assignDevice("edge 99")
		.assignDevice("chrome 99")
		.pass("this is a passed test");
		
		extentReport
		.createTest("Test5", "Test desc")
		.assignAuthor(new String[] {"Sanjeev", "Devendra", "Divya"})
		.assignCategory(new String[] {"Sanity","Smoke", "Regression"})
		.assignDevice(new String[] {"chrome 99","edge 99", "firefox"})
		.pass("this is a passed test");
		
		extentReport
		.createTest("Test6", "Test desc")
		.assignAuthor("Sanjeev", "Devendra", "Divya")
		.assignCategory("Sanity","Smoke", "Regression")
		.assignDevice("chrome 99","edge 99", "firefox")
		.pass("this is a passed test");



		extentReport.flush();
		Desktop.getDesktop().browse(new File("reportattribute.html").toURI());
	}

}
