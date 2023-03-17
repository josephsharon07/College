/**
 * leapyr
 */
public class leapyr {

    public static void main(String[] args) {
        
        int yr = 2020;

        if (yr%400==0 && yr%100!=0 || yr%4==0){

            System.out.println(yr +" is leap year");
        }
        else{
            System.out.println(yr +" is not leap year");
        }


    }
}