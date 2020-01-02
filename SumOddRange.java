import java.util.Scanner;
public class SumOddRange {
	    public static boolean isOdd(int number)
	    {
	        if(number > 0)
	        {
	        	if (!(number % 2 == 0))
	        	{
	        		return true;
	        	}
	        }
	        	return false;
	    }
	    	
	    //
	    	
	    
	   
	    public static int sumOdd (int start, int end)
	    {
	    	int sum = 0;
	    	
	    	
	    	if (end >= start && end > 0 && start > 0)
			{
	    		for (int i = start; i <= end; i++)
	    		{
	    				
	    				
	    				if(isOdd(i))
	    				{
	    						sum += i;
	    				}
	    		}
	    		return sum;
			}
	    return -1;	
	   }
	     
	   
	   public static void main (String[]args)
	   {
		   int start = 0, end = 0;
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter start num: ");
		   start = input.nextInt();
		   System.out.println("Enter end num: ");
		   end = input.nextInt();
		   
		   
		   
		   
		  System.out.println(sumOdd(start, end));
		   
		
		   
		   
	   }
}
