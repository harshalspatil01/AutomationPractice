package assignment;

public class revisionofallbasic {

	public static void main(String[] args) {
		int num1 = 30;
		int num2 = 15;
		int res = num1 + num2;
		System.out.println("Num1 Value ="+num1);
		System.out.println("Num2 Value ="+num2);
		System.out.println("Res Value ="+res);	

		System.out.println("_________Multiplication___________");
		
	float m1=20.5f;
	double m2=21.55;
	double res1 = m1*m2;
	System.out.println("m1 Value ="+m1);
	System.out.println("m2 Value ="+m2);
	System.out.println("res1 Value ="+res1);
	
	System.out.println("___________find ascii value_____________");
	char ch='M';
	int ascii=ch;
	//can also cast char to int
	int castAscii = (int)ch;
	System.out.println("Ascii Value ="+ascii);
	System.out.println("castAscii Value ="+castAscii);
	
	System.out.println("___________find ascii value_____________");
	int dividend = 33, divisor=21;
	double quotient = dividend/divisor;
	int remainder = dividend%divisor;
	System.out.println("Quotient"+quotient);
	System.out.println("Remainder"+remainder);
	
	float first = 1.20f, second = 2.45f;

    System.out.println("--Before swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);

    // Value of first is assigned to temporary
    float temporary = first;

    // Value of second is assigned to first
    first = second;

    // Value of temporary (which contains the initial value of first) is assigned to second
    second = temporary;

    System.out.println("--After swap--");
    System.out.println("First number = " + first);
    System.out.println("Second number = " + second);
    
	}	
		
	}
    		


	

