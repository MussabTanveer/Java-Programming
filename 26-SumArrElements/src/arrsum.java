
public class arrsum {

	public static void main(String[] args) {
		int arr[] = {21,16,75,34,9};
		int sum = 0;
		
		for (int counter = 0; counter < arr.length; counter++) {
			sum += arr[counter];
		}
		
		System.out.println("Sum of these numbers is " + sum);

	}

}
