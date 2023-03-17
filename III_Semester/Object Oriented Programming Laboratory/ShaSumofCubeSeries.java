import java.util.Scanner;
class ShaSumofCubeSeries
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter The  Number:");
        int a=s.nextInt();
        int num = 0;
        int sum = 0;
        int i=1;
        for(i=1;i<=a;i++)
        {
            sum=(i*i*i);       
            System.out.println(i+"*"+i+"*"+i+" = "+sum);
               
        }

        } 
    }