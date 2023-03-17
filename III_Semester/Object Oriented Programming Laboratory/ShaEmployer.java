class ShaEmployer
{
    public static void main(String[] args) 
    {
        float bp;
        System.out.println("Select your Profession From The Following");
        System.out.println("1. Professor");
        System.out.println("2. Assistant Professor");
        System.out.println("3. Associate Professor");
        System.out.println("4. Programmer");
        System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        
        switch (choice) 
        {
            case 1:
            prof();
            break;

            case 2:
            ast_prof();
            break;

            case 3;
            ass_prof();
            break;

            case 4:
            prog();
            break;

            default:
            System.out.println("Invalid choice");
            break;
    }

    void prof()
    {
    empolyee.getdata();
    bp=profe.bp;
    empolyee.clac(bp);
    empolyee.display();        
    }

    void ast_prof()
    {
    empolyee.getdata();
    bp=astprofe.bp;
    empolyee.clac(bp);
    empolyee.display();
    }

    void ass_prof()
    {
    empolyee.getdata();
    bp=assprofe.bp;
    empolyee.clac(bp);
    empolyee.display();       
    }

    void prog()
    {
    empolyee.getdata();
    bp=assprofe.bp;
    empolyee.clac(bp);
    empolyee.display();              
    }


}

class empolyee
{
    public static int id;
    public static String name, mail_id, address;
    public static long phone;
    public int da,hra,pfi,scf,net_sal;

    float clac(float basic)
    {
        da=(95/100)*basic;
        hra=(10/100)*basic;
        pfi=(12/100)*basic;
        scf=(0.1F/100)*basic;
        net_sal=basic+da+hra+pfi+scf;
        return net_sal;
    }

    void diplay()
    {
        System.out.println("Name of the Employee: " +name);
        System.out.println("Employee id: " +id);
        System.out.println("Employee Mail "+mail_id);
        System.out.println("Employee Address: " +address);
        System.out.println("Employee Phone: "+phone);
        System.out.println("Bill of the Employee: "+net_sal);
    }

    void getdata()
    {
        System.out.println("Enter Name:")
        name=sc.nextLine();
        System.out.println("Enter Id Number:");
        id=sc.nextInt();
        System.out.println("Enter Mail_id:");
        mail_id=sc.nextLine();
        System.out.println("Enter The Phone Number: ")
        phone=sc.nextLong();
        System.out.println("Enter The Address:")
        address=sc.nextLine();
    }


}
