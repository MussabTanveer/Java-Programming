import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int age;
		
		System.out.print("Enter age: ");
		age = in.nextInt();
		// Logical AND
		if(age>0 && age<=30){
			System.out.println("Your are too young");
		}
		else{
			System.out.println("Your are a senior citizen");
		}
		System.out.println();
		int apples = 3;
		int mangoes = 5;
		// Logical OR
		if(apples>1 || mangoes<3){
			System.out.println("You are lucky");
		}
		else{
			System.out.println("You are unlucky");
		}

	}

}
