public class PerfectNumber {
    public static boolean isPerfectNumber(int x)
    {
        if (x < 0)
        {
            return false;
        }
        
        int sum = 0;
        for (int i = 1; i < x; i++)
        {
            if(x % i == 0)
            {
                sum += i;
            }
        }
        
        if (sum == x && sum != 0)
        {
            return true;
        }
        return false;
    }
    public static void main (String [] args)
    {
    	System.out.println(isPerfectNumber(0));
    }
}
