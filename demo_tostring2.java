import java.util.*;
class demo_tostring2{
    int eno;
    String ename;
    float sal;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter emp no");
        eno=sc.nextInt();
        System.out.println("enter emp name");
        ename=sc.next();
        System.out.println("enter emp nal");
        sal=sc.nextFloat();
    }
    public String toString()
    {
        return "emp no="+eno+"\n name="+ename+"salary="+sal;
    }
    public static void main(String aaa[])
    {
       demo_tostring2 ob=new demo_tostring2();
       ob.accept();
       System.out.println(ob);
    }
     
}
