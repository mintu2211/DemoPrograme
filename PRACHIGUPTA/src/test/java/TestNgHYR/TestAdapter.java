package TestNgHYR;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestAdapter extends TestListenerAdapter {

	@Override
	public void onTestSuccess(ITestResult tr) {
	System.out.println("test passed");	
	}

	@Override
	public void onTestFailure(ITestResult tr) {
		System.out.println("test failed");	
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		System.out.println("test skipped");	
	}

	@Override
	public void onStart(ITestContext testContext) {
		
	}

	@Override
	public void onFinish(ITestContext testContext) {
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test started");	
	}

}
