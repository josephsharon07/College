import java.util.Scanner;

public class ShaLeapYear {
    public static void main(String[] args) {
        int ye, a, b, c;
        System.out.println("Enter The Year : \t");
        Scanner y = new Scanner(System.in);
        ye = y.nextInt();
        a = ye % 4;
        b = ye % 400;
        c = ye % 100;

        if (a == 0 && c != 0 || b == 0) {
            System.out.println("The year Is a leap Year");

        } else {
            System.out.println("The Year Is Not a leap year");
        }

    }
}