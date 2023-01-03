package assignment;

public class staticornonstaticvariabledeclaration {
	
	static int empid =31096;
	double Salary = 35235.60;

	public static void main(String[] args) {
		System.out.println("Assignment Start");
		int age = 26;
		System.out.println("LocalVariable : "+age);//local variable
		System.out.println("Direct call to static variable empid: "+empid);//Static variable
		staticornonstaticvariabledeclaration H1= new staticornonstaticvariabledeclaration ();//object creat
		System.out.println("NSGV Salary : "+H1.Salary);//non static variable
		System.out.println("NSGV Salary : "+staticornonstaticvariabledeclaration.empid);
		empid=31063;
		H1.Salary=33000;
		System.out.println("updated static variable empid: "+empid);
		System.out.println("NSGV updated Salary : "+H1.Salary);
	}

}
