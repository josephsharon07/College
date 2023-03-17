class student
{
    int roll_no, sub1, sub2, avg;
    String name;

    void get(String n, int r, int a, int aa )
    {
        roll_no=r;
        name=n;
        sub1=a;
        sub2=aa;

    }
        void display()
        {
            int total=sub1+sub2;
            avg=total/2;

            System.out.println("Roll No: "+roll_no);
            System.out.println("Name: "+name);
            System.out.println("Subject_1: "+sub1);
            System.out.println("Subject_2: "+sub2);
            System.out.println("Total: "+total);
            System.out.println("Average: "+avg);
            System.out.println("\n");

    }
}


public class shastudent
{
    public static void main(String args[]) 
    {
        student s1 =new student();
        student s2 =new student();
        student s3 =new student();
        student s4 =new student();
        student s5 =new student();
        student s6 =new student();
        student s7 =new student();
        student s8 =new student();
        student s9 =new student();
        student s10 =new student();

        s1.get("Maheswar",2089,88,98);
        s3.get("Forlan",2090,68,93);
        s4.get("James",2091,85,99);
        s5.get("Sharon",2092,69,91);
        s6.get("Joseph",2093,98,88);
        s7.get("Vivek",2094,58,98);
        s8.get("Santhosh",2010,88,98);
        s9.get("Santhosh",2010,88,98);
        s10.get("Santhosh",2010,88,98);

        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
        s6.display();
        s7.display();
        s8.display();
        s9.display();
        s10.display();
      
    }
}
