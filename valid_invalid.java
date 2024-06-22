import java.util.*;

public class valid_invalid {
    public static void main(String aaa[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter name");
         String s1=sc.next();
         StringBuffer s2=new StringBuffer("");
         for(int i=0;i<s1.length();i++)
         {
             char c=s1.charAt(i);
             if(c>='a' && c<='z')
             s2.append((char)(c-32));
             else if(c>='A'&& c<='Z')
             s2.append((char)(c+32));
             if(Character.isDigit(c))
             s2.append('*');
         }

         System.out.println(s2);

    }    
}
