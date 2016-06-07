import java.util.Scanner;

public class IFdecision {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num;
		System.out.print("Enter any number: ");
		num = in.nextInt();
		if(num == 5){
			System.out.println("You entered 5!");
		}
		else{
			System.out.println("You didn't enter 5!");
		}
		System.out.print("Enter your birth-date: ");
		num = in.nextInt();
		if(num > 15){
			System.out.println("Your birthdate is after 15!");
		}
		else{
			System.out.println("Your birthdate is before 15!");
		}

	}

}
