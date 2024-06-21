//accept n number of staff parttime,fulltime and display..
import java.util.*;

abstract class staff
{
    String name,add;
    abstract void disp();
}
class fulltimestaff extends staff{
  String dept;
  int sal;
  fulltimestaff(String name,String add,String dept,int sal)
  {
     this.name=name;
     this.add=add;
     this.dept=dept;
     this.sal=sal;
  }
  void disp()
  {
     System.out.println("STAFF NAME="+name);
     System.out.println("STAFF ADD="+add);
     System.out.println("STAFF DEPT="+dept);
     System.out.println("STAFF SAL="+sal);
  }
}
class parttimestaff extends staff{
  
  int hours,rate;
  parttimestaff(String name,String add,int hours,int rate)
  {
     this.name=name;
     this.add=add;
     this.hours=hours;
     this.rate=rate;
  }
  void disp()
  {
     System.out.println("STAFF NAME="+name);
     System.out.println("STAFF ADD="+add);
     System.out.println("NUMBER OF HOURS="+hours);
     System.out.println("RATE="+rate);
     System.out.println("SALARY="+(hours*rate));
  }
}

public class abstract_class4 {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();

         fulltimestaff ob[]=new fulltimestaff[n];
         parttimestaff ob1[]=new parttimestaff[n];

         int ch;
         do{
             System.out.println("\n 1-fulltime \n 2-partime");
             ch=sc.nextInt();
             switch(ch)
             {
                 case 1:for(int i=0;i<n;i++)
                 {
                     System.out.println("enter name");
                     String name=sc.next();
                     System.out.println("enter address");
                     String add=sc.next();
                     System.out.println("enter dept");
                     String dept=sc.next();
                     System.out.println("enter sal");
                     int sal =sc.nextInt();
                     ob[i]=new fulltimestaff(name,add,dept,sal);
                 }
                     for(int i=0;i<n;i++)
                     {
                         ob[i].disp();
                     }
                     break;
                 
                 case 2:for(int i=0;i<n;i++)
                 {
                     System.out.println("enter name");
                     String name=sc.next();
                     System.out.println("enter address");
                     String add=sc.next();
                     System.out.println("enter number of hours");
                     int hours=sc.nextInt();
                     System.out.println("enter rate");
                     int rate =sc.nextInt();
                     ob1[i]=new parttimestaff(name,add,hours,rate);
                 }
                     for(int i=0;i<n;i++)
                     {
                         ob1[i].disp();
                     }
                     break;
                 }
                }while(ch<3);
            }
    }
    
