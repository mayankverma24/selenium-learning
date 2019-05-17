package inheritance;

class BaseClass {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("The sum of the given numbers: " + z);
	}

	public void Subtraction(int x, int y) {
		z = x - y;
		System.out.println("The difference between the given numbers: " + z);
	}
	
	static void Sample() {
		System.out.println("Sample class");
		
	}
}
