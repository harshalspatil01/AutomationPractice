package MethodOverLoading;

public class MethodOverLoading02 {
	
	public void square() {
		System.out.println("No Parameter Method Called");
	}
	public void square(int number) {
		int square = number * number;
		System.out.println("Method with Integer Argument Called:" + square);
	}
	public void square(float number) {
		float square = number * number;
		System.out.println("Method with float Argument Called:" + square);
	}

	public static void main(String[] args) {
		MethodOverLoading02 obj1 = new MethodOverLoading02();
		obj1.square();
		obj1.square(25);
		obj1.square(33.25f);
	}

}
