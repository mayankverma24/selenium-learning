package testNGTut;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class ClassA {
	
	@AfterClass
	public void afclass()
	{
		System.out.println("This is After class");
	}
	
	@BeforeClass
	public void bfclass()
	{
		System.out.println("This is Before class");
	}
	
	@AfterTest
	public void af()
	{
		System.out.println("This is After Test");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is Test 1");
	}
	
	@Test
	//@Ignore
	public void test2()
	{
		System.out.println("This is Test 2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("This is Test 3");
	}
	
	@BeforeMethod
	public void bf()
	{
		System.out.println("This is Before Test");
	}
}
