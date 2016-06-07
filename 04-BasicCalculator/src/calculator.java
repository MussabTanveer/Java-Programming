import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		double num1, num2, ans;
		System.out.print("Enter first number: ");
		num1 = cin.nextDouble();
		System.out.print("Enter second number: ");
		num2 = cin.nextDouble();
		ans = num1 + num2;
		System.out.println("Addition: " + ans);
		ans = num1 - num2;
		System.out.println("Subtraction: " + ans);
		ans = num1 * num2;
		System.out.println("Multiplication: " + ans);
		ans = num1 / num2;
		System.out.println("Division: " + ans);
		ans = (num1 + num2) / 2;
		System.out.println("Average: " + ans);
		ans = num1 % num2;
		System.out.println("Remainder: " + ans);
		
	}

}
