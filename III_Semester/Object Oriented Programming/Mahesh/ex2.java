

public class ex2 {
    public static void main(String[] args) {
        String rev="" ,txt = "mam";
        
    for (int i = 2; i >=0 ; --i) {
         rev =rev + txt.charAt(i);     
        }
        System.out.println(rev);
        System.out.println(txt);
        if (rev!=txt) {
            System.out.println(" palinbrome");
        }
        else{
            System.out.println("not palinbrome");
        }
    }
}
