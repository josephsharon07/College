
abstract class a{
    
    a(){
        System.out.println("this is contructor of abstract ");

    }
    abstract void a_method();

    void normal(){
        System.out.println("this is normal method of class");
    }

}
class subclass extends a{
    void a_method(){
        System.out.println("this is abstract method");
    }
}



public class ex2 {

    public static void main(String[] args) {
        subclass s = new subclass();
        s.a_method();
        s.normal();
       
        
    }
    
}
