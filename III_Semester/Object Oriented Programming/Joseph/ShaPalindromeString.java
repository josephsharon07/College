import java.util.Scanner;

import javax.print.event.PrintEvent;
import javax.print.event.PrintJobListener;

import java.util.Scanner;
public class ShaPalindromeString{
    public static void main(String[] args) 
    {

      System.out.print("Enter Any String :");
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String rev = "";
      for (int i = str.length() - 1; i >= 0; i--) 
      {
        rev += str.charAt(i);
      }
      if (str.equals(rev))
    {
      System.out.println("Th String "+str+ " is palindrome");
    }
    else
    {
      System.out.println("Th String "+str+ " is not palindrome");
    }

    }

  }