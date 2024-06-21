import java.util.*;
public class display_revers {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        for(int  i=s2.length-1;i>=0;i--)
        {
            System.out.println(s2[i]+" ");
        }
    }
}
