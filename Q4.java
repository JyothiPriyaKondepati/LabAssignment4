import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		int number = -1;
		boolean isOdd = false;
		do {
			System.out.println("Please enter a number or enter -1 if you want to quit");
			Scanner sc = new Scanner(System.in);
			try {
				number = sc.nextInt();
			} 
			catch (InputMismatchException e) 
			{
				System.out.println("You must enter an integer");
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			isOdd = checkOddNo(number);
			if (isOdd) {
				System.out.println("You have entered an odd number");
			} 
			else 
			{
				System.out.println("You have entered an even number");
			}
		} while (number != -1);
	}

	private static boolean checkOddNo(int n) {
		return (n % 2 != 0);

	}

}
