import java.util.*;
public class twod2_array {
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
             for(int j=0;j<n;j++)
             {
                 a[i][j]=sc.nextInt();
             }
         }
         System.out.println("Display orignal matrix:");
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
         {
             System.out.println(a[i][j]+'\t');
         }
         }
         System.out.println("transpose of matrix:");
         for(int i=0;i<m;i++)
         {
            for(int j=0;j<n;j++)
         {
          System.out.println(a[j][i]+"\t");
         }
         System.out.println();
        }
  


    }
    
}
