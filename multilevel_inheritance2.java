import java.util.*;
public class multilevel_inheritance2 {
   static class continent{
     String contname;
     Scanner sc=new Scanner(System.in);
     void acceptc()
     {
        System.out.println("enter continent name");
        contname=sc.next();
     }

   }
   static class country extends continent{
     String countryname;
     
     void acceptcountry()
     {
        System.out.println("enter country name");
        countryname=sc.next();
     }

   }
   static class state extends country {
     String state;
     
     void accepts()
     {
        System.out.println("enter state name");
        state=sc.next();
     }

   
    void disp()
    {
         System.out.println("continent name="+contname);
         System.out.println("country name="+countryname);
         System.out.println("state name="+state);
    }  
   }

    public static void main(String aaa[])
    {
         state ob=new state();
         ob.acceptc();
         ob.acceptcountry();
         ob.accepts();
         ob.disp();
    }
}
