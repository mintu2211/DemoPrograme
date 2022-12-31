package PrachiGupta;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Software {

	@Test
	@Parameters({"SoftwareComapanyName"})
	public void testcase1(String name)
	{
		System.out.println(name);
	}
	
	
}
