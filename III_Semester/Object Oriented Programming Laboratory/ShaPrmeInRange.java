
class ShaPrmeInRange
{
    public static void main(String[] args) 
    {
        int low=1;
        int up=30;
        System.out.println("THe Prime Number Between 1 to 30 are:");
        for(int i=low; i<up; i++)
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        
        }
    }

    static boolean isPrime(int n)
    {

        if(n<2)
        return false;
        
        for(int i=2;i<n;i++)
        {
            if(n%2==0)
            {
                return false;
            }
        }
        return true;
    }
}