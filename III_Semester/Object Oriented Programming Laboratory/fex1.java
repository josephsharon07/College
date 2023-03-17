public class fex1{

    public static void main(String[] args) {
     int n =121,temp =n,rev=0,rem;
     while(n>0){
        rem= n%10;
        rev = (rev*10) + rem;
        n = n/10;
     }

     System.out.println(rev);
     if(rev==temp){
        System.out.println("palinbrome");
    
    }
    else{
        System.out.println("not palinbrome");
    }
    }
}