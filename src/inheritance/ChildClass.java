package inheritance;

public class ChildClass extends BaseClass {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers: " + z);
	}

	public static void main(String args[]) throws InterruptedException {
		int a = 20, b = 10;
		ChildClass demo = new ChildClass(); // -Reference of Child class & object of child class can access methods of
											// both the classes

		//BaseClass demo = new ChildClass(); // - Reference of Base class & object of child class can access methods of
											// base class only
		//BaseClass demo = new BaseClass(); // - Reference of Base class & object of Base class can access methods of base
											// class only
		//ChildClass demo = new BaseClass(); // - Reference of Child class & object of Base class - Invalid scenario, 
											//Child cannot hold parent

		demo.addition(a, b);
		demo.Subtraction(a, b);
		demo.multiplication(a, b);
		Sample();
	}
}