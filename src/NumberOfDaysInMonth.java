
public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear (int year)
    {
    	if (year >=1 && year <=9999)
        {
            if ((year%4)==0)
            {
                if((year%100)==0)
                {
                    if ((year%400)==0)
                    {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    	
    }
    public static int getDaysInMonth (int month, int year)
    {
       if (month < 1 || month > 12 || year < 1 || year > 9999)
       {
    	   return -1;
       }
       
       System.out.println(isLeapYear(2000));
       
    	   switch (month)
           {
    	   case 1:
    		   System.out.println("Jan");
    		   int day = 31;
    		   System.out.println(day);
    		   break;
    	   
    	   case 2:
    		   System.out.println("Feb");
    		   if (isLeapYear(year))
    		   		{
    			   		day =29;
    			   	}
    		   else {
    			   day = 28;
    		   		}
    		   
    		   System.out.println(day);
    		   
    		   break;
    	   
    	   case 3:
    		   System.out.println("Mar");
    		   day = 31;
    		   System.out.println(day);
    		   break;
    	   
    	   case 4:
    		   System.out.println("Apr");
    		   day = 30;
    		   System.out.println(day);
    		   break;
    	  
    	   case 5:
    		   System.out.println("May");
    		   day = 31;
    		   System.out.println(day);
    		   break;
    	   
    	   case 6:
    		   System.out.println("Jun");
    		   day = 30;
    		   System.out.println(day);
    		   break;
    	  
    	   case 7:
    		   System.out.println("Jul");
    		   day = 31;
    		   System.out.println(day);
    		   break;
    	   
    	   case 8:
    		   System.out.println("Aug");
    		   day = 31;
    		   System.out.println(day);
    		   break;
    	  
    	   case 9:
    		   System.out.println("Sept");
    		   day = 30;
    		   System.out.println(day);
    		   break;
    	   
    	   case 10:
    		   System.out.println("Oct");
    		   day = 31;
    		   System.out.println(day);
    		   break;
    	   
    	   case 11:
    		   System.out.println("Nov");
    		   day = 30;
    		   System.out.println(day);
    		   break;
    	   
    	   case 12:
    		   System.out.println("Dec");
    		   day = 31;
    		   System.out.println(day);
    		   break;
           }
    	   
       return 0;
        
    }
    
    public static void main (String [ ]args)
    {
    	int year = 0, month = 0;
    	
    	System.out.println(getDaysInMonth (2, 2000));
    }
}
