import java.util.Scanner;

public class average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int grade;
		int avg;
		int counter = 0;
		
		while(counter < 10) {
			grade = input.nextInt();
			total += grade;
			counter++;
		}
		
		avg = total / counter;
		
		System.out.println("Your average is " + avg);
	}

}
