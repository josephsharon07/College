abstract class UGmark{
    abstract float getpercentage();
}
class Z extends UGmark
{
 public float m1;
   public float m2;
   public float m3;


 Z(float m1 , float m2 , float m3){
    this.m1 = m1;
    this.m2 = m2;
    this.m3 = m3;


}
float getpercentage(){
    return (this.m1+this.m2+this.m3)/300*100;


}

}
class Y extends UGmark

{
  public float m1;
  public float m2;
  public float m3;
  public float m4;

     Y(float m1 ,float m2 ,float m3 ,float m4){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
    }  
float getpercentage(){
    return (this.m1+this.m2+this.m3+this.m4)/400*100;


}

}
class ex4 {
    public static void main(String[] args) {
        Z z = new Z(86,96,63);
        Y y = new Y(33,53,67,92);
        float zmark = z.getpercentage();
        float ymark = y.getpercentage();
        System.out.println("mark of z: "+ zmark+"\n"+ "mark of y: "+ymark);
        
    }
}