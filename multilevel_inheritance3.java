import java.util.*;
public class multilevel_inheritance3 {
      static class grandfather{
        String gname;
        Scanner sc=new Scanner(System.in);
         void acceptg()
         {
            System.out.println("enter grandfather name");
            gname=sc.next();
         }
      }
      static class father extends grandfather{
        String fname;
        
         void acceptf()
         {
            System.out.println("enter father name");
            fname=sc.next();
         }
      }
      static class child extends father{
        String child;
        
         void acceptc()
         {
            System.out.println("enter child name");
            child=sc.next();
         }
         void disp()
         {
             System.out.println("Grandfather name="+gname);
             System.out.println("father name="+fname);
             System.out.println("child name="+child);
         }
      }
      public static void main(String aaa[])
      {
         child ob=new child();
         ob.acceptg();
         ob.acceptf();
         ob.acceptc();
         ob.disp();
      }
}
