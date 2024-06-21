import java.util.*;
public class array_of_object2 {
   static class emp{
     int eno;
     String ename;
     float sal;
     void accept(int eno,String ename,float sal)
     {
         this.eno=eno;           
         this.ename=ename;           
         this.sal=sal;           
     }
     void disp()
     {
       System.out.println("eno="+eno);
       System.out.println("ename="+ename);
       System.out.println("sal="+sal);
     }
   } 
   public static void main(String aaa[])
   {
    emp ob[]=new emp[10];
    Scanner sc=new Scanner(System.in);

    System.out.println("enter limit");
    int n=sc.nextInt();
       
    for(int i=0;i<n;i++)
    {
       ob[i]=new emp();
       System.out.println("enter eno");
       int eno=sc.nextInt();
       
       System.out.println("enter ename");
       String ename=sc.next();
       
       System.out.println("enter salary");
       float sal=sc.nextFloat();
       
       ob[i].accept(eno,ename,sal);
    }
    for(int i=0;i<n;i++)
    {
        ob[i].disp();  
    }
   }
}
