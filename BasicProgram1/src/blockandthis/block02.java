package blockandthis;

public class block02 {

	static int age;
	double salary;
	/* static block or SIB */
	static {
		age = 30;
		System.out.println("I am SIB");
	}
	/* non-static block or IIB */
	{
		salary = 45000.32;
		System.out.println("I am NSIB/IIB");
	}
	public static void main(String[] args) {
		System.out.println("main() Starts..");
		System.out.println("age: " + block02.age);
		System.out.println("---------------------------------");
		block02 b1 = new block02();
		System.out.println("salary: " + b1.salary);
		System.out.println("main() ends..");
	}

}
