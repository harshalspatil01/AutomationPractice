package assignment;

public class VariablePractice {
	
	static int EmpId = 31096;
	double Salary=30000.73;
	static char Grade='A';
	static boolean Result ;
	
	static void addTwoNum(int a, int b) {
		double res = a + b;
		double res1=a*b;
	
		System.out.println("Direct pring Value ="+res);
		System.out.println("Direct pring Value ="+res1);
		//System.out.println("Direct pring Value ="+res2);
	} 
	void calling() {
		System.out.println("I am Calling");
	}
	public static int getEmpId() {
		
		System.out.println("Print empId again: ");
		return EmpId;
	}
	public static void PrintResult() {
		System.out.println("Print salary again: "+Result);
		
	}
	static double x=20,y=30,z=12;
	public static double average(int a, int b, int c)
	{
		return (a+b+c)/3;
	}
	
	public static double average () //Method overloading with different number of integer with line no 31
	{
		return (x+y+z)/3;
	}
	
	public int NonStatic(int num1,int num2)
	{
		return (num1*num2);
	}
	
	public double avg () //NonStatic Method without parameter
	{
		return (x+y+z)/3;
	}
	
	public static void main(String[] args) {
		int age = 25;
		System.out.println("Local Variable age="+age);
		age = 35; // renitialization of local variable;
		System.out.println("Local Variable age updated value="+age);
		System.out.println("SGV EmpId ="+VariablePractice.EmpId);//access SGV variable by standard method we can access it by variable name also
		EmpId=20156; // Global variable reinitaialize
		System.out.println("SGV EmpId ="+EmpId);//we can access it by variable name also
		VariablePractice s1 = new VariablePractice();//Created object or instence for non static variable
		
		 System.out.println("NSGV Salary ="+s1.Salary); // access non static variable by using created object or instence
		s1.Salary= 25000.00; // Reinitialize to NSGV 
		System.out.println("NSGV Salary ="+s1.Salary); // and print the value of reinitialized salary
		System.out.println("SGV Char ="+Grade);
		Grade = 'B';
		System.out.println("SGV Char ="+Grade);
		System.out.println("SGV Result="+Result);
		addTwoNum(100,200);
		addTwoNum(100,225);
		addTwoNum(10,250);
		VariablePractice s3 = new VariablePractice();
		s1.calling();
		System.out.println(getEmpId());
		int res=getEmpId();
		System.out.println("Result : "+res);
		PrintResult();
		System.out.println("Average of 3 number: "+average()); //calling without argument average method
		System.out.println("Average of 3 number: "+average(10,50,60));// calling with with argument average method
		int a=15,b=13,c=22;// reinitialized the argument datatype of int argument average method  
		System.out.println("Average of 3 number: "+average(a,b,c));
		System.out.println("Calling NS Method : "+s1.NonStatic(20, 12));
		System.out.println("Calling NS method : "+s1.avg());
	}

}
