package assignment;

public class ifelseconditions {

	public static void main(String[] args) {
		CheckEvenOddNumber(78);
		System.out.println(isNumberEven(51));
		ifelseconditions.ifelseif(96);
		checkevenoddnubmer(203);
		
		System.out.println("****************Leap Year Program****************");
		int year=2020;
		if (((year%4==0)&&(year%100!=0)) || (year%400==0)) {
			System.out.println("Leap Year : ");
		}else {
			System.out.println("No Leap Year : ");
		}
		
		System.out.println("*********For Loop Program**********");
		for(int i=20;i>=1;--i) {
			System.out.println(i+" I Love You....");
		}

	}
	public static void CheckEvenOddNumber(int Num) {
		
		if (Num%2==0)
		{
			System.out.println("Number is even : ");
		} else
		{
			System.out.println("Number is odd : ");	
		}
		}
		public static boolean isNumberEven(int Num) {
			if (Num%2==0)
			{return true;
		}else {
			return false;
		
		}
	}
		public static void ifelseif(int marks){ 
			
			if(marks<50){
				System.out.println("fail");  
			}        				
			else if(marks>=50 && marks<60){  
				System.out.println("D grade");  
			}  
			else if(marks>=60 && marks<70){  
				System.out.println("C grade");  
			}  
			else if(marks>=70 && marks<80){  
				System.out.println("B grade");  
			}  						
			else if(marks>=80 && marks<90){  
				System.out.println("A grade");  
			}else if(marks>=90 && marks<100){  
				System.out.println("A+ grade");  
			}else{  
				System.out.println("Invalid!");  
			}
			}  
			static void checkevenoddnubmer(int a) {
				if(a%2==0) {
					System.out.println("even number"+a);
				} else {  
					System.out.println("Given number is odd number: "+a);  
		}  
			}
		}
		
	


