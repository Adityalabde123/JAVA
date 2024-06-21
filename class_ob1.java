//accept employee information from user in class....
import java.util.*;
public class class_ob1 {
       static class Emp{
         int eno;
         String ename;
         float sal;
         void accept()
         {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter employee no=");
             eno=sc.nextInt();
             
             System.out.println("enter employee name=");
             ename=sc.next();
             
             System.out.println("enter employee no=");
             sal=sc.nextFloat();
         }
         void disp()
         {
             System.out.println("employee no="+eno);
             System.out.println("employee name="+ename);
             System.out.println("employee sal="+sal);
         }
        }
   public static void main(String aaa[])
   {
      Emp ob=new Emp();
      ob.accept();
      ob.disp();
    }
}
