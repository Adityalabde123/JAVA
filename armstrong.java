import java.util.*;
public class armstrong {
    public static void main(String abc[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter number");
        int n=sc.nextInt();
        int n1=n;
        int s=0;
        while(n>0)
        {
            int d=n%10;
            s=s+(d*d*d);
            n=n/10;
        }
        if(s==n1)
        System.out.println("number is armstrong");
        else
        System.out.println("not armstrong");
    }   
}
