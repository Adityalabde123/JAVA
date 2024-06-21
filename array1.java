import java.util.*;
public class array1 {
   
        public static void main(String aaa[]){
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++)
         {
             System.out.println("enter numbers=");
             a[i]=sc.nextInt();

         }
         System.out.println("n numbers ");
         for(int i=0;i<n;i++)
         {
             System.out.println(a[i]+"\t");
         }
    }
    
}

