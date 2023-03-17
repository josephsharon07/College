public class ShaSumCube {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int sum=0;

        while(i<=n)
        {
            sum+=i*i*i;
            i++;
        }
        System.out.println("Sum is : "+sum);
    }
    
}
