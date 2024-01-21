package fibonacci;

public class basis {

	// I want to create a simple fibonacci sequence calculator, by adding f1 to f2
	// --> f3
	// I then want to change the first variable to the second variable and the
	// second variable to the sum of the previous
	// calculation
	// ----> f1 = 2 + f2 = 3 so f3 = 5 ---> f1 = 3 + f2 = 5 so f3 = 8

	private int f1 = 1; // First Variable
	private int f2 = 2; // Second Variable
	private int f3;

	public int sum() { // Calculating the third variable

		int f3 = f1 + f2;
		return f3;
	}

	public void setF1(int f1) {
		this.f1 = f1;
	}

	public void setF2(int f2) {
		this.f2 = f2;
	}

	public int getF1() {
		return f1;
	}

	public int getF2() {
		return f2;
	}

	public int getF3() {
		return f3;
	}
}
