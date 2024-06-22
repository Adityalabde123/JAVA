import java.util.*;
interface integer{
     void check(int n);
}
class check_num implements integer{
     public void check(int n)
     {
         if(n>0)
         System.out.println("number is positive");
         else 
         System.out.println("number is negetive");
     }
}
public class interfaceexample4 {
public static void main(String aaa[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
     check_num ob=new check_num();
     ob.check(n);
}
    
}    
