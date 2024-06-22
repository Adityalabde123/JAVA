//display the manager having maximum total salary
import java.util.*;
class employee{
     Scanner sc=new Scanner(System.in);
     int id,sal;
     String name,dept;
     employee(){
         id=101;
         name="aditya";
         dept="computer";
         sal=100000;
     }
     employee(int id,String name,String dept,int sal)
     {
         this.id=id;
         this.name=name;
         this.dept=dept;
         this.sal=sal;
     }
     void accept()
     {
         System.out.println("enter id name dept sal:");
         id=sc.nextInt();
         name=sc.next();
         dept=sc.next();
         sal=sc.nextInt();
     }
     void disp()
     {
         System.out.println("ID="+id);
         System.out.println("name="+name);
         System.out.println("department="+dept);
         System.out.println("sal="+sal);
     }
}
class manager extends employee{
     int bonus;
     manager()
     {
         bonus=3000;
     }
     manager(int bonus)
     {
         this.bonus=bonus;

     }
     void acceptm()
     {
         System.out.println("enter bonus");
         bonus=sc.nextInt();
     }
     void dispm()
     {
         System.out.println("bonus="+bonus);
     }
}
public class max_tot_sal {
    public static void main(String aaa[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter limit");
        int n=sc.nextInt();
        manager ob[]=new manager[n];
        for(int i=0;i<n;i++)
        {
             ob[i]=new manager();
             ob[i].accept();
             ob[i].acceptm();

        }
        int max=ob[0].sal+ob[0].bonus;
        int index=0;
        for(int i=1;i<n;i++)
        {
            if((ob[i].sal+ob[i].bonus)>max)
            {
                max=ob[i].sal+ob[i].bonus;
                index=i;
            }
        }
        System.out.println("MAXIMUM SALARY=");
        ob[index].disp();
        ob[index].dispm();
    }
}
