import java.util.*;


public class shacomplex 
{
    public static void main(String[] args) 
    {

        ComplexNumber c = new ComplexNumber(12,12);
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("choice the operation \n 1.addition \n 2.multiply \n 3.subraction \n4.dividend \n 5.close");

        do 
        {

            n = scanner.nextInt();
            switch (n) 
            {
                case 1:
                c.add(2,3);   
                break;

                case 2:
                c.sub(5,3);
                break;

                case 3:
                c.mul(2,7);
                break;

                case 4:
                c.div(8,3);
                break;
            
                default:
                break;
            }
            
        } 
        while (n!=5);
        scanner.close();

    }
    
}

class ComplexNumber
{
    public float real ,img;

    ComplexNumber(float real, float img)
    {
        this.real = real;
        this.img = img;

    }

    public void add(float real, float img)
    {
        this.real+= real;
        this.img+=  img;
        System.out.println("addition\n real number "+ this.real +"\n imgmanary number "+ this.img);
    } 

    public void mul(float real, float img)
    {
        this.real*= real;
        this.img*=  img;
        System.out.println("multipication\n real number "+ this.real +"\n imgmanary number "+ this.img);
    } 

    public void sub(float real, float img)
    {
        this.real-= real;
        this.img-=  img;
        System.out.println("subraction\n real number "+ this.real +"\n imgmanary number "+ this.img);
    } 

    public void div(float real, float img)
    {
        this.real/= real;
        this.img/=  img;
        System.out.println("divition\n real number "+ this.real +"\n imgmanary number "+ this.img);
    } 
}

