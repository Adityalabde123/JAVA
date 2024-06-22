//counts number of digits,spaces,character's from file...
import java.io.*;
import java.util.*;

public class file_handeling4{
    public static void main(String aaa[])throws Exception
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter file name");
      String s1=sc.next();
      FileInputStream f1=new FileInputStream(s1);
      int k,d=0,ch=0,sp=0,sym=0;
    
    while(true)
    {
         k=f1.read();
         if(k==-1)
         break;
         if(k>='0'&&k<='9')
         d++;
         
         if((k>='A'&&k<='Z')||(k>='a'&&k<='z'))
         ch++;

         if(k==' ')
         sp++;

        else
        sym++;

    }
    System.out.println("number of digits="+d);
    System.out.println("number of spaces="+sp);
    System.out.println("number of char="+ch);
    System.out.println("number of symbols="+sym);
       f1.close();
 }    

}
