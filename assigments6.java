import java.util.*;

public class assigments6 {
   static class teacher{
     int tid;
     String tname,designation,subject;
     float sal;
     void accept()
     {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter teacher id");
        tid=sc.nextInt();
        System.out.println("enter teacher name");
        tname=sc.next();
        System.out.println("enter teacher designation");
        designation=sc.next();
        System.out.println("enter teacher subject");
        subject=sc.next();
        
        System.out.println("enter teacher salary");
        sal=sc.nextFloat();
    }
    void disp()
    {
         System.out.println("pid="+tid);
         System.out.println("pname="+tname);
         System.out.println("deignation="+designation);
         System.out.println("salary="+sal);
         
    }
   }    
   public static void main(String aaa[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter limit");
     int n=sc.nextInt();
     teacher ob[]=new teacher[n];
     for(int i=0;i<n;i++)
     {
         ob[i]=new teacher();
         ob[i].accept();
     }
     for(int i=0;i<n;i++)
     {
         if(ob[i].subject.equals("java"))
         {
             ob[i].disp();
         }
     }
   }
}
