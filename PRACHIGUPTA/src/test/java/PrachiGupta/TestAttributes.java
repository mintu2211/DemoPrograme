package PrachiGupta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttributes {
     
	
	@Test(groups = "software company")
	public void Infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups = "software company")
	public void wipro()
	{
		System.out.println("wipro");
	 
	}
	@Test(groups = "Automobile")
	public void Tata()
	{
		System.out.println("Tata");
	}
	
	@Test(groups = "Automobile")
	public void Maruti()
	{
		System.out.println("Maruti");
	
	}
}
