package loops;

public class forloop {

	public static void main(String[] args) {
		for(int i=10;i>=0;--i) {
			System.out.println(i);
		}
		System.out.println("\n**************Capital Alphabets****************");
		Isoddevennumber();
		for (char c1 = 'A'; c1 <= 'Z'; c1++) {
			System.out.print(c1+" ");
		}
			
			System.out.println("\n************** Small ****************");
			for (char a ='a';a<='z';a++) {
				System.out.print(a+" ");

			
		}
		System.out.println("\n******************************");
	 	for(char c1='z';c1>='a';c1--) {
	 		System.out.print(c1+" ");
	 	}
	 	
	}
	static void Isoddevennumber() {
		for (int i = 1; i <= 50;i++) {
			if (!(i % 2 == 0)) {
				System.out.println( i+ "I Love You");
			}
			else {
				System.out.println(i+"I Hate You");
			}
		}
 		
 	}
}
	 	
	 
	 
