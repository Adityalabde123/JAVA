import java.util.*;
abstract class staff
{
    protected: int id;

    protected: String name;
    abstract void disp();
}
class officestaff extends staff{
  
    officestaff(String name,int id)
  {
     this.name=name;
     
     this.id=id;
    }
    void disp()
    {
        System.out.println("STAFF NAME="+name);
        System.out.println("STAFF id="+id);
        
     
     
  }
}
public class abstract_class6 {
    public static void main(String aaa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
         int n=sc.nextInt();
         officestaff ob[]=new officestaff[n];
         for(int i=0;i<n;i++)
         {
             ob[i]=new officestaff("aditya",101);
         }
         for(int i=0;i<n;i++)
         {
             ob[i].disp();
         }
    }
}
