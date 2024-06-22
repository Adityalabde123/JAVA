import java.util.*;
public class leap_year {
    public static void main(String[] abc)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter year");
         int y=sc.nextInt();
         if(y%4==0)
         System.out.print("LEAP YEAR");
         else
         System.out.print("NOT LEAP YEAR");
    }
}
