//accept n number from user and display in reverse order..
import java.util.*;

public class collection_framework4 {
  public static void main(String aaa[])
     {
            ArrayList a1=new ArrayList();
            Scanner sc=new Scanner(System.in);
            System.out.println("enter limit");
            int n=sc.nextInt();
            System.out.println("enter n numbers");
            for(int i=0;i<n;i++)
            {
                 int num=sc.nextInt();
                 a1.add(num);
            }
            System.out.println("ArrayList="+a1);
            Collections.reverse(a1);
            System.out.println("arrayylist="+a1);
        }   
}
