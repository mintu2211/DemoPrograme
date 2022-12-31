package TestNgHYR;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Iretry implements IRetryAnalyzer{

	int intcount =0;
	int maxRetryCount=5;
	
	public boolean retry(ITestResult result) {
		if(intcount<maxRetryCount)
		{
			intcount++;
			return true;
		}
		
		return false;
	}

}
