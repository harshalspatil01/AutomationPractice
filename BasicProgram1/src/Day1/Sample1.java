package Day1;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Hello, Good Morning");
		System.out.println("Program Starts");
		byte byteVariable;
		short shortVariable;
		int intVariable;
		long longVariable;
		float floatVariable;
		double doubleVariable;
		char charVariable;
		boolean booleanVariable;		
		//Syntax to initlize a variable: variablename = value;
		byteVariable = 25;//-10 | -89 | 15
		shortVariable = 50;//-10 | -89
		intVariable = 150;//-10 | -89
		longVariable = 2530l;//-10 | -89 | 25
		floatVariable = 25.36f;//25 | -69 |5454 | 0.25f
		doubleVariable = 36.56d;//25 | -69 |54.54 | 0.256
		charVariable = 'A';//'a' | 'Z'
		booleanVariable = true;//true | false
		//print all the varibale value inthe console
		System.out.println("byteVariable = "+byteVariable);//
		System.out.println("shortVariable = "+shortVariable);
		System.out.println("intVariable = "+intVariable);
		System.out.println("longVariable = "+longVariable);
		System.out.println("floatVariable = "+floatVariable);
		System.out.println("doubleVariable = "+doubleVariable);
		System.out.println("charVariable = "+charVariable);
		System.out.println("booleanVariable = "+booleanVariable);
		// syntax to declare & initialize a variable 25+35=60
		//datatype variablename=value
		int num1=25, num2=35, Result=num1+num2;
		System.out.println("Number 1 is :"+num1);// it will show int num1 value
		System.out.println("Number 2 is :"+num2);// it will show int num2 value
		System.out.println("Additon of Two Number:"+Result);// it will show Result of num1 + num2
		System.out.println("Additon of Two Number:"+num1+num2);//it will show Result concatination
		System.out.println("Additon of Two Number:"+(num1+num2));
		System.out.println("Additon of Two Number:"+(55+60));
		Result=num1-num2;
		System.out.println("Number 1 is :"+num1);// it will show int num1 value
		System.out.println("Number 2 is :"+num2);// it will show int num2 value
		System.out.println("Additon of Two Number:"+Result);// it will show Result of num1 + num2
		System.out.println("Additon of Two Number:"+num1+num2);//it will show Result concatination
		System.out.println("Additon of Two Number:"+(num1+num2));
		System.out.println("Additon of Two Number:"+(55+60));
		num1=44;
		num2=23;
		double Result2 =num1/num2;
		System.out.println("Number 1 is :"+num1);// it will show int num1 value
		System.out.println("Number 2 is :"+num2);// it will show int num2 value
		System.out.println("Dividation of Two Number:"+Result2);// it will show Result of num1 + num2
		System.out.println("Additon of Two Number:"+num1+num2);//it will show Result concatination
		System.out.println("Additon of Two Number:"+(num1+num2));
		Result2 =num1%num2;
		System.out.println("Number 1 is :"+num1);// it will show int num1 value
		System.out.println("Number 2 is :"+num2);// it will show int num2 value
		System.out.println("Dividation of Two Number:"+Result2);// it will show Result of num1 + num2
		System.out.println("Additon of Two Number:"+num1+num2);//it will show Result concatination
		System.out.println("Additon of Two Number:"+(num1+num2));
		System.out.print("Program ends");
	}

}
