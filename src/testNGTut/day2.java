package testNGTut;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class day2 {

	@Test
	public void afclass() {
		System.out.println("This is After class");
	}

	@BeforeClass
	public void bfclass() {
		System.out.println("This is Before class");
	}

	@AfterTest
	public void hjhj() {
		System.out.println("This is After Test");
	}

	@Test(groups = { "smoke" })
	public void af() {
		System.out.println("This is Test 1");
	}

	@Test(groups = { "smoke" })
	public void test2() {
		System.out.println("This is Test 2");
	}

	@Test
	public void test3() {
		System.out.println("This is Test 3");
	}

	@BeforeMethod
	public void bf() {
		System.out.println("This is Before Method");
	}
}
