package assignment;

public class percentage {

	public static void main(String[] args) {
		 float percentage;
	      float total_marks;
	      float scored;
	      percentage sc = new Scanner(System.in);
	      System.out.println("Enter your marks ::");
	      scored = sc.main();

	      System.out.println("Enter total marks ::");
	      total_marks = sc.nextFloat();

	      percentage = (float)((scored / total_marks) * 100);
	      System.out.println("Percentage ::"+ percentage);

	}

}
