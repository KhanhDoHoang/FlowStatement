import java.util.Scanner;
public class SumOddRange {
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int number = 0, end = 0, sum = 0;
		
		System.out.println("Enter first number: ");
		number = input.nextInt();
		
		System.out.println("Enter last number: ");
		end = input.nextInt();
		
		for (int i = 0; i < end; i++)
		{
			
			number += i;
		}
	}
}
