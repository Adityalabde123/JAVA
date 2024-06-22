import java.util.*;
public class single_inheritance {
    static class college{
        int cno;
        String cname,cadd;
        Scanner sc=new Scanner(System.in);
        void acceptc()
         { 
              System.out.println("enter college no");
              cno=sc.nextInt();
              System.out.println("enter college name");
              cname=sc.next();
              System.out.println("enter college add");
              cadd=sc.next();
         }
    }
    static class student extends college{
         int sno;
         String name;
         float per;
         void accepts()
         {
            System.out.println("enter student no");
            sno=sc.nextInt();
            System.out.println("enter student name");
            name=sc.next();
            System.out.println("enter student per");
            per=sc.nextFloat();
         }
         void disp()
         {
             System.out.println("college no="+cno);
             System.out.println("college name="+cname);
             System.out.println("college address="+cadd);
             System.out.println("student no="+sno);
             System.out.println("student name="+name);
             System.out.println("student per="+per);
         }
    }
    public static void main(String aaa[])
    {
         student ob=new student();
         ob.acceptc();
         ob.accepts();
         ob.disp();
    }
}
