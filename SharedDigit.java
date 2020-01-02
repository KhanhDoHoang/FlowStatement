public class SharedDigit {
   
    public static boolean hasSharedDigit(int num1, int num2)
    {
        int last1 = 0;
        int last2 = 0;
        int first1 = 0;
        int first2 = 0;
        // in the range of 10 - 99 (inclusive)
        if((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99))
        {
            while (num1 != 0 || num2 != 0)
            {
                last1 = num1 % 10;
                last2 = num2 % 10;
                first1 = num1 / 10;
                first2 = num2 / 10;
                
                if (last1 == last2)
                {
                    return true;
                }
                
                else if (first1 == first2)
                {
                	return true;
                }
                
                else if (first1 == last2)
                {
                	return true;
                }
                else if (first2 == last1)
                {
                	return true;
                }
                else 
                	return false;
                 
            }
            
        }
        return false;
    }
    public static void main (String[]args)
    {
    	System.out.println(hasSharedDigit(12,43));
    }
}
