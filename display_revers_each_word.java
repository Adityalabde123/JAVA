import java.util.*;
public class display_revers_each_word {

        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter string");
            String s1=sc.nextLine();
            String s2[]=s1.split(" ");
            for(int i=0;i<=s2.length;i++)
            {
               StringBuffer sbr=new StringBuffer(s2[i]);
               sbr.reverse();
               System.out.println(sbr+" ");
            }
        }
    }
       
