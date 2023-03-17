import java.util.Scanner;

public class ShaReverseInteger {
    public static void main(String[] args) {
        int d, rev = 0;
        System.out.println("Enter The Number : \t");
        Scanner t = new Scanner(System.in);
        d = t.nextInt();
        while (d > 0) {
            rev = rev * 10 + d % 10;
            d /= 10;
            System.out.print(rev);

        }
        System.out.println("\n");
    }
}
