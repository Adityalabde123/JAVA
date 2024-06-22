import java.util.*;
public class prime_number {
  public static void main(String abc[])
  {
     int n,i;
     Scanner sc=new Scanner(System.in);
     System.out.print("enter number");
     n=sc.nextInt();
     for(i=2;i<n;i++)
     {
       if(n%i==0)
       break;
     }
     if(i==n)
     System.out.printf("Number is prime=%d",n);
     else
     System.out.printf("number is not prime=%d",n);
  }    
}
