package ExtentReport;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Chapter3 {

	public static void main(String[] args) throws IOException {
		ExtentReports extentReport = new ExtentReports();
		File file=new File("report.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
		extentReport.attachReporter(sparkReporter);

		
	extentReport.createTest("Test based Test")
	.log(Status.INFO, "info")
	.log(Status.INFO, "<b>info1</b>")
	.log(Status.INFO, "<i>info1</i>")
	.log(Status.INFO, "<b><i>info1</i></b>")
    .info(MarkupHelper.createLabel("This is a highlighted message", ExtentColor.RED));
	
	extentReport.createTest("ScreenShot Test1", "This is for attaching the screenshot")
	.info("this is a info msg");
    
		
		extentReport.flush();
		Desktop.getDesktop().browse(new File("report.html").toURI());

	}
}
