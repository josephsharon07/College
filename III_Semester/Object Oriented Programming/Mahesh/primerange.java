import java.util.*;
public class primerange {
    public static void main(String[] args) {
        int start ,end ,flag; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter end");
        end = sc.nextInt();
        for (int i = start; i <=end; i++) {
            flag =0;
            for (int j = 2; j < i/2 ; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }

                
            }
            if (flag == 0) {
                System.out.println(i);
            
            }


            
        }

sc.close();

    }
    
}
