import java.util.*;
public class valid_invalid2 {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter name");
         String s1=sc.next();
         int flag=0;
         for(int i=0;i<s1.length();i++)
         {
                 char c=s1.charAt(i);
                 if(c>=33 && c<=64 || c>=92 && c<=96 || c>=123 && c<=126)   //its aN ASCII value 
                 flag=1;
                 break;
        }
        if(flag==1)
        System.out.println("NAME IS INVALID");
        else
        System.out.println("NAME IS VALID");
    }    
}
 