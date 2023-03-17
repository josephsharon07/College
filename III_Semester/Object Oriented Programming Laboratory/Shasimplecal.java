import java.util.*;

public class Shasimplecal 
{
    public static void main(String[] args) 
    {
        int n,x,y;
        Scanner u = new Scanner(System.in);
        System.out.println("Enter The First Number:");
        x=u.nextInt();
        System.out.println("Enter The Second Number:");
        y=u.nextInt();
        calculator c = new calculator(x,y);
        System.out.println("Select the operation: \n\t1.addition \n\t2.subration \n\t3.multiplication \n\t4.divide\n");
        Scanner scanner = new Scanner(System.in);  

        do
        {
         n = scanner.nextInt();
        switch (n) {
            case 1:
            c.add();
            break;

            case 2:
            c.sub();
            break;

            case 3:
            c.mul();
            break;

            case 4:
            c.div();
            c.rem();
            break;

        
        
            default:
                break;
        }      
    }
    
    while(n!=5);
    scanner.close();

}   
}


class calculator {

    public int a,b;
    calculator(int a,int b)
    {
        this.a=a ;
        this.b=b;
    }

    public void add()
    {
        System.out.println("Addition: "+(this.a+this.b));
    }

    public void mul()
    {
        System.out.println("Multiplication: "+(this.a*this.b));
    }

    public void sub()
    {
        System.out.println("Subraction: "+(this.a-this.b));
    }

    public void div()
    {
        System.out.println("Division: "+(this.a/this.b));
    }

    public void rem()
    {
        System.out.println("Remainder: "+(this.a%this.b));
    }

    
}
