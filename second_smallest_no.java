import java.util.*;
public class second_smallest_no {
    public void array(int a[],int n)
    {
         int temp;
         for(int i=0;i<n;i++)
         {
             for(int j=i+1;j<n;j++)
             {
                if(a[i]>a[j])
                {
                     temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                }
             }
            }
            System.out.println("second smallest no="+a[1]);
      
      }
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit elemnt");
         int n=sc.nextInt();
         int a[]=new int[n];

         System.out.println("enter array element");
         for(int i=0;i<n;i++)
         {
           a[i]=sc.nextInt();
         }

         second_smallest_no ob=new second_smallest_no();
         ob.array(a,n);        
    }
    }
