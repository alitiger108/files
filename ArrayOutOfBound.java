import java.util.*;
public class ArrayOutOfBound
{
	public static void main(String args[])
	{
		try (Scanner input = new Scanner(System.in)) {
			{
				try {
					int[] array = {9,8,7,6,5,4,3,2,1,0,2,5,8,9,6,3};
					System.out.println("*************************");
					System.out.println("Enter Aray Index Number: ");
					int index = input.nextInt();
					System.out.println("========================");
					System.out.println("We Are Having Number: "+array[index]);
					System.out.println("*************************");}
				
				catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Array Index Is Out Of Bounds");
					System.out.println("*************************");
				}
			}
		}
	}
}