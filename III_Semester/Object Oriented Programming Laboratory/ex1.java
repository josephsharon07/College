import java.io.PrintStream;

class ex1 {
   
    public static void main(String[] args) {
        PrintStream c = System.out;
        String s = "hello 1.124 world";
        String num = s.replaceAll("[^1-9,.]", "");
        float i = Float.parseFloat(num);
        c.println("extracted number is " + i );

    }
    
}