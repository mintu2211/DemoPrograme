package PrachiGupta;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Automobile {

	@Test
	@Parameters({"AutomobileName"})
	public void testcase1(String name)
	{
		System.out.println(name);
	}
	
	
	
}
