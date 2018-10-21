import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		two twoObj = new two();
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		twoObj.setName(name);
		twoObj.Print();
	}

}
