import java.util.*;
public class array_of_object {
   static class emp{
     int eno;
     String ename;
     float sal;
     void accept()
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter eno");
       eno=sc.nextInt();
       
       System.out.println("enter ename");
       ename=sc.next();
       
       System.out.println("enter salary");
       sal=sc.nextFloat();

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
       ob[i].accept();
    }
    for(int i=0;i<n;i++)
    {
        ob[i].disp();  
    }
   }
}
