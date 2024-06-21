import java.io.*;
import java.util.*;
public class char_stream_classes_filehandeling3 {

    public static void main(String aaa[])throws Exception
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter string");
         String s1=sc.nextLine();
         FileOutputStream f1=new FileOutputStream("cdj.txt");
         for(int i=0;i<s1.length();i++)
         {
             int ch=s1.charAt(i);
             f1.write(ch);
         }

         f1.close();
         System.out.println("file copy successfully");

    }    
}
