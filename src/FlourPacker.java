public class FlourPacker {

	public static final int BIG = 5;
	public static final int SMALL = 1;
	
    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
    	int sum = 0;
    	int temp = 0;
    	
    	//1 bad left which is ok
    	
        if (bigCount >= 0 && smallCount >= 0)
        {
            bigCount *= 5;
            smallCount *= 1;
            if ((bigCount + smallCount == goal || bigCount + smallCount - 1 == goal)  )
            {
                    return true;
            }
        }
        return false;
        
    }
    public static void main (String[]args)
    {
    	System.out.println(canPack(1,0,4));
    }
}
