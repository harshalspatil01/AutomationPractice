package MethodOverLoading;

class Class_Adder {

	static int add(int a, int b) {
		return a + b;
	}
	static int add(int a, int b, int c) {
		return a + b * c;
	}
	public static void main(String[] args) {
		System.out.println(Class_Adder.add(33, 24));
		System.out.println(Class_Adder.add(11, 21, 11));
		
		Class_Adder obj1 = new Class_Adder();
		
		System.out.println("__________________");
		
		obj1.disp('C', 33);
		obj1.disp(33, 'B');
	}
	public void disp(int num,char c) {
		System.out.println(num+" "+c);
	}
	public void disp(char c, int num) {
		System.out.println(c + " " + num);
	}
}
