//overload the constructor accept 5 person...
import java.util.*;
public class constructor_assigments4 {
   static class person{
    int pid,age;
    String pname,gender;
    person()
    {
         pid=1;
         pname="sai";
         age=44;
         gender="male";
    }
    person(int pid,String pname,int age,String gender)
    {
         this.pid=pid;
         this.pname=pname;
         this.age=age;
         this.gender=gender;
         
    }
    void disp()
    {
        System.out.println(pid+"\t"+pname+"\t"+age+"\t"+gender);

    }
   } 
   static public void main(String aaa[])
   {
     person ob[]=new person[5];
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<5;i++)
     {
         System.out.println("enter person id");
         int id=sc.nextInt();
         System.out.println("enter person name");
         String pname=sc.next();
         System.out.println("enter person age");
         int age=sc.nextInt();
         System.out.println("enter person gender");
         String gender=sc.next();
         ob[i]=new person(id,pname,age,gender);
     }
     for(int i=0;i<5;i++)
     {
         ob[i].disp();
     }
   }
}
