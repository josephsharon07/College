/**
 * calculator
 */
 

import java.util.*;

public class simplecal {
    public static void main(String[] args) {
        int n;

        calculator c = new calculator(2,3);
        System.out.println("selecte the operation \n 1.addition \n 2.subration \n 3.multiplication \n 4.divide");
        Scanner scanner = new Scanner(System.in);  
        do{
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
            break;
        
        
            default:
                break;
        }      
    }while(n!=5);
    scanner.close();

}   
}
class calculator {
    public int a,b;
    calculator(int a,int b){
        this.a=a ;
        this.b = b;
    }
    public void add(){
        System.out.println("addition: "+(this.a+this.b));
    }
    public void mul(){
        System.out.println("addition: "+(this.a*this.b));
    }
    public void sub(){
        System.out.println("addition: "+(this.a-this.b));
    }
    public void div(){
        System.out.println("addition: "+(this.a/this.b));
    }

    
}
