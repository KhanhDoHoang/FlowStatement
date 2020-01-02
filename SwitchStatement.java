
public class SwitchStatement {
	public static void main (String[]args)
	{
/*		int value = 3;
		if (value == 1)
		{
			System.out.println("Value was 1");	
		}
		else if (value == 2)
		{
			System.out.println("Value was 2");
		}
		else 
		{
			System.out.println("Was not 1 or 2");
		}
*/		
		int switchValue = 1;
		
		switch (switchValue)
		{
		case 1:
			System.out.println("Value was 1");
			break;
		
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3: case 4: case 5:
			System.out.println("was a 3, or a 4, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;
			
		default:
			System.out.println("Was not 1 or 2");
			break;
		}
	//Create a new switch statement using char instead of int
	// Create a new char variable
	// Create a switch testing for
	// A, B, C, D, or E
	// display a message of any of these are found and then break
	//Add a default which displays a message saying not found
		
		char switchValue2 = 'Z';
		switch (switchValue2)
		{
		case 'A':
			System.out.println("This is A");
			break;
			
		case 'B':
			System.out.println("This is B");
			break;
			
		case 'C': case 'D': case 'E':
			System.out.println("This is C, or D, or E");
			System.out.println("Actually this is " + switchValue2);
			
		default:
			System.out.println("NOT FOUND!");
			System.out.println("So sorry yeh!");
		}
		
		String month = "January";
		switch(month.toLowerCase())
		{
		case "january":
			System.out.println("This is jan");
			break;
		case "june":
			System.out.println("This is jun");
			break;
		default:
			System.out.println("Not sure");
			
		}
		
		
		
	}
	
	public static void printDayOfTheWeek (int day)
	{
		switch(day)
		{
		case 1:
			System.out.println ("Sunday");
			break;
			
		case 2:
			System.out.println ("Monday");
			break;
			
		case 3:
			System.out.println("Tuesday");
			break;
			
		case 4: 
			System.out.println("Wed");
			break;
			
		case 5:
			System.out.println("Thurs");
			break;
			
		case 6:
			System.out.println("Fri");
			break;
			
		case 7:
			System.out.println("Sat");
			break;
			
			default:
				System.out.println("Invalid Value!");
		}
	}
}
