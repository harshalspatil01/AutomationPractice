
public class Logicalop {

	public static void main(String[] args) {
		// Variables Definition and Initialization
				boolean bool1 = true, bool2 = false;
				
				// Logical AND
				System.out.println("bool1 && bool2 = " + (bool1 && bool2));//false	

				// Logical OR
				System.out.println("bool1 || bool2 = " + (bool1 || bool2)); // true	

				// Logical Not
				System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));// true
				
				// Variables Definition and Initialization
				int num1 = -12, num2 = -4;
				System.out.println("num1: " + num1 + "--->num2: " + num2);// 
				// is equal to
//				boolean res = (num1 == num2);
//				System.out.println("num1 == num2 = " + res);// 
						//or
				System.out.println("num1 == num2 = " + (num1 == num2));// false
				// is not equal to
				System.out.println("num1 != num2 = " + (num1 != num2));// true
				// Greater than
				System.out.println("num1 >  num2 = " + (num1 > num2));// false
				// Less than
				System.out.println("num1 <  num2 = " + (num1 < num2));// true
				// Greater than or equal to
				System.out.println("num1 >= num2 = " + (num1 >= num2));// false
				// Less than or equal to
				System.out.println("num1 <= num2 = " + (num1 <= num2));// true
	}

}
