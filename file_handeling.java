//creating an simpel file handelig and read characters... 
import java.io.*;

public class file_handeling {
    public static void main(String aaa[])
    {
 try{
     FileInputStream f1=new FileInputStream("abc.txt");

    int k;
    while(true)
    {
         k=f1.read();
         if(k==-1)
         break;
         System.out.println((char)k);

    }
       f1.close();
 }    
 catch(Exception e)
 {
     System.out.println(e);
 }
}
}
