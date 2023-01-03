package loops;

public class ifcondition01 {

	public static void main(String[] args) {
		
		int num=14, num1=45;
		
		if(num==num1) {
			System.out.println("Number is greater than Number1");
		}else
		{ System.out.println("Number is smaller that number1");
		}
		if(num==num1) {
		
			System.out.println("Number1 is equals to number1");
		}else if(num>num1) {
			System.out.println("Number1 is greater than numbers1");
		}else {
			System.out.println("Number1 is smaller than number1");
		}
		int sub=50,sub1=30;
		if(sub>=50 && sub1>29) {
			System.out.println("pass....");
		}else {
			System.out.println("fail....");
		}
		{  
			//defining a variable  
			int number=54;  
			//Check if the number is divisible by 2 or not  
			if(number%2==0){  
				System.out.println("even number");  
			}else{  
				System.out.println("odd number");
				oddernumber J1 = new oddernumber();
				System.out.println(J1.CheckOddNumber(500));
			}  
			class oddernumber {
		 void CheckOddNumber(int num) {
			if (num%2==0);
		 }
			
	}
		
	}
	}
}




