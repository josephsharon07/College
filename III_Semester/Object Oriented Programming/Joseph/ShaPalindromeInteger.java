
public class ShaPalindromeInteger {
    public static void main(String[] args) {
        int r, sum = 0;
        int n = 453;
        int temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        System.out.println("\n" + temp + " is " + (temp == sum ? " " : "not" + " a palindrome\n"));
    }
}