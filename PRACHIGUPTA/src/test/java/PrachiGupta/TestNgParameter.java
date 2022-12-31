package PrachiGupta;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParameter {
	
	@Test
	@Parameters({"i", "j"})
	public void add(int a , int b)
	{
		System.out.println("Addition  " +a+b);
	}
	
	@Test
	@Parameters({"i", "j"})
	public void sub(int a , int b)
	{
		System.out.println("subtraction  " +(a-b));
	}
	@Test
	@Parameters({"i", "j"})
	public void multiply(int a , int b)
	{
		System.out.println("multiply  " +a*b);
	}
	

}
