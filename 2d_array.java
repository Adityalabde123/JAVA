import java.util.*;
public class 2d_array {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         int a[][]=new int[10][10];
         System.out.println("enter row and column");
         int m=sc.nextInt();
         int n=sc.nextInt();
         System.out.println("enter first matrix");
         for(int i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
                 a[i][j]=nextInt();
             }
         }
         for(int i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
         {
            c[i][j]=a[i][j]+b[i][j];
         }
         }
         for(int i=0;i<m;i++)
         {
            for(j=0;j<n;j++)
         {
          System.out.println(c[i][j]+"\t");
         }
         print();
         }


    }
    
}
