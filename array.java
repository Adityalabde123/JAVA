import java.util.*;
public class array {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array");
         int size=sc.nextInt();
         int a[]=new int[size];
          
         System.out.println("enter the element of array");
         for(int i=0;i<size;i++)
         {
             a[i]=sc.nextInt();
         }
        System.out.println("\n the elements of array are");
        for(int i=0;i<size;i++)
        {
             System.out.print("\n"+a[i]);
        }

    }
}
