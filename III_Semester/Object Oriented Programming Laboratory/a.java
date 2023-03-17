abstract class shape{
    public float l ,b;
   abstract double printarea();
}
class rectangle extends shape{
    rectangle(float le,float br){
        this.l = le;
        this.b = br;

    }
     double printarea(){
        return l*b;
     }

}
class square extends shape{
    square(float le, float br){
        this.l = le;
        this.b = br;
    }
     double printarea(){
        return (l *b)/2;
     }

}
class circle extends shape{
    circle(float le){
        this.l = le;
        
    }
     double  printarea(){
        return  3.14 * l * l;
     }
}

class a{
    public static void main(String[] args) {
        rectangle r = new rectangle(2, 3);
        square s = new square(2, 3);
        circle c =new circle(6);
        System.out.println("area of rectangle "+ r.printarea()+"\narea of square "+ s.printarea()+"\narea of circle "+ c.printarea());
    }
}