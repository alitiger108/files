import java.util.Scanner;
public class KidsGame {
	public static void main(String args) {
		try {
			try (Scanner input = new Scanner(System.in)) {
				System.out.println("1st Input = ");
				float num1 = input.nextFloat();
				
				System.out.println("2nd Input = ");
				float num2 = input.nextFloat();

				int inp1 = (int)num1; int inp2 = (int)num2;
			}
			System.out.println("The Exact Answer Will Be: ");
			}
		catch (ArithmeticException e) {
			System.out.println("Number is not divisible by 0");
		}
		
		catch (Exception ex) {
			System.out.println("Invalid Entry");
		}
		
		
	}
}
