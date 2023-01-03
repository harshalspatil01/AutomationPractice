
public class Unary03 {

	public static void main(String[] args) {
		int a = 0, b;
		b = a++ + ++a + ++a + a;
	 
		System.out.println("a: "+a);// 
		System.out.println("b: "+b);// 
		System.out.println("**********************");
		a = -5;
		b = a-- + --a + --a + a;
		//	5      3    1     0
		//  4      2    0
		System.out.println("a: "+a);//  
		System.out.println("b: "+b);//  

		a = 21;
		b = --a + --a + --a + a + ++a + a++;

		System.out.println(a);// 
		System.out.println(b);// 

		a = -2;
		b = a-- + a + ++a + a++ + ++a + a++ + a;
	//		-2	  -3	-2	-2		0	0	 1
		//	-3	   -3	-2	-1		0	1	 1
		System.out.println(a);//1
		System.out.println(b);//-8

	}

}
