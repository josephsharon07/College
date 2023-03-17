import java.util.*;
public class ShaArmstrong 
{
    public static void main(String[] args) 
    {
        int   nu, num, r, result=0;
        Scanner n=new Scanner(System.in);
        nu=n.nextInt();
        num = nu;
        while(nu>0)
        {
            r=nu%10;
            result+=(r*r*r);
            nu/=10;
        }
        System.out.println(num+" is "+(num==result ? "" : "not")+" an Amstrong number");
        } 
    }
