import java.util.*;
public class search_name {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter limit");
         int n=sc.nextInt();
         String s1[]=new String[n];
         for(int i=0;i<n;i++)
         {
             s1[i]=sc.next();
         }
         System.out.println("enter name to search=");
         String name=sc.next();
         int flag=0;
         for(int i=0;i<n;i++)
         {
            if(s1[i].equals(name))
            {
                flag=1;
                System.out.println("name found position=" +i);
                break;

            }

         }
         if(flag==0)
         System.out.println("name not found");
    }
}
