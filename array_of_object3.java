//enter book name and search its quantity..
import java.util.*;
public class array_of_object3{
     static class book{
         int bno,qty;
         String bname;
        void accept()
        {
             Scanner sc=new Scanner(System.in);
             System.out.println("enter book no=");
             bno=sc.nextInt();
             System.out.println("enter book name=");
             bname=sc.next();
             System.out.println("enter book quantity=");
             qty=sc.nextInt();
        }
        
     }
     public static void main(String aaa[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();
         book ob[]=new book[n];
         for(int i=0;i<n;i++)
         {
             ob[i]=new book();
             ob[i].accept();
         }
         System.out.println("Enter book name to search qty=");
         String name=sc.next();
         int flag=0;
         for(int i=0;i<n;i++)
         { 
             if(ob[i].bname.equals(name))
             {
                 System.out.println("quantity="+ob[i].qty);
                 flag=1;
                 break;
             }
         }
         if(flag==0)
         {
             System.out.print("BOOK NAME NOT FOUND....");
         }
     }
}