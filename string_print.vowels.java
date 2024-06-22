import java.util.*;
public class string_print.vowels {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter string");
         String s1=sc.next();
         for(int i=0;i<s1.length();i++)
         {
             if(s1.charAt[i]=='a'||s1.charAt[i]=='e'||s1.charAt[i]=='i'||s1.charAt[i]=='o'||s1.charAt[i]=='u')
             System.out.println(s1.charAt(i));
         }    
        }
}
