import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println(a+"\n"+b);
        for(int i=0;i<count;i++){
            c=a+b;
            a=b;
            b=c; 
            System.out.println(c);   
        }
        scanner.close();

    }
    
}
