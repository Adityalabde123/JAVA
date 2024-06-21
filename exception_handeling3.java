import java.io.*;
public class exception_handeling3 {
    public static void main(String aaa[])
    {
 try{
     FileOutputStream f1=new FileOutputStream("aaa.txt");
     System.out.println("enter data upto ctrl+z");
    int k;
    while((k=System.in.read())!=-1)
    {
         f1.write(k);

    }
       f1.close();
       System.out.println("file data inserted successfully");
 }    
 catch(Exception e)
 {
     System.out.println(e);
 }
}
}

