//accept student info and display percentage wise info with descending order..
 import java.util.*;
public class array_of_object4 {
     static class student{
            int sno;
            String sname;
            float per;
        void accept()
        {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter student no=");
              sno=sc.nextInt();
              sc.nextLine();
             System.out.println("enter student name=");
              sname=sc.next();
             System.out.println("enter student per=");
              per=sc.nextFloat();
        }
        static void sort_by_per(student ob[],int n)
        {
             int i,pass;
             for(pass=1;pass<n;pass++)
             {
                 for(i=0;i<n-pass;i++)
                 {
                     if(ob[i].per<ob[i+1].per)
                     {
                         student t=ob[i];
                         ob[i]=ob[i+1];
                         ob[i+1]=t;
                     }
                 }
             }
             for( i=0;i<n;i++)
             {
                 System.out.println(ob[i].sno+"\t" +ob[i].sname + "\t" +ob[i].per);
             }
        }
     }    
     public static void main(String aaa[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter n number of students");
         int n=sc.nextInt();
         student ob[]=new student[n];
         
         for(int i=0;i<n;i++)
         {
             ob[i]=new student();
             ob[i].accept();
         }
         student.sort_by_per(ob,n);
     }

}
