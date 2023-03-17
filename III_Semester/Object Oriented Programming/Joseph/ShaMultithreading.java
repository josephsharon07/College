import java.util.Random;


class firstthread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            Random r = new Random();
            int num;
            num = r.nextInt(1000);
            System.out.println("ramdom number "+num);
            if (num%2==0) {
            secondthread s1 = new secondthread(num);
            s1.start();
            }
            else{
            thirdthread s2 = new thirdthread(num);
            s2.start();

            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                
            }
            
        }
        
        
    }
    
}

class secondthread  extends Thread {
    int num;
     secondthread(int num){
        this.num = num;

    }
    @Override
    public void run() {
        System.out.println("Square of "+num+": "+(num*num));
        
    }
    
}
class thirdthread extends Thread {
    int num;
     thirdthread(int num){
        this.num = num;

    }
    @Override
    public void run() {
        System.out.println("cude of "+num+": "+(num*num*num));
        
    }

}

public class ShaMultithreading {
    public static void main(String[] args) {
        firstthread f = new firstthread();
        f.start();
    }
}