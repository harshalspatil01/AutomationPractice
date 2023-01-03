package Day2;

public class GlobalVariable1 {
	static int empId=1005;
	double salary=45000;
	int pinCode=425401;

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//local variable
		int age=15;
		System.out.println("Local Variable age: "+age);
		/* Creating an instance/object to access non-static members of the class*/
		/* 
		NonStaticGlobalVariableExample1 n1;
		n1 = new NonStaticGlobalVariableExample1();
		*/
		GlobalVariable1 n1 = new GlobalVariable1();
		System.out.println("NSGV empId: "+n1.empId); 
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("****************Updated NSGV***********************");
		n1.empId=5001;
		n1.salary=45222.655;
		System.out.println("NSGV empId: "+n1.empId); 
		System.out.println("NSGV salary: "+n1.salary);
		System.out.println("****************New Object NSGV***********************");
		GlobalVariable1 n2 = new GlobalVariable1 ();
		n2.salary = 30000.12;
		n2.empId = 31096;
		System.out.println("n2: NSGV empId: "+n2.empId); 
		System.out.println("n2: NSGV salary: "+n2.salary);
		System.out.println("Program Ends");
		System.out.print("Thank You Program Ends");
	}

}
