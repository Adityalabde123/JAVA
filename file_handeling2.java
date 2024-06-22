import java.io.*;
public class file_handeling2 {
    public static void main(String aaa[])
    {
         try{
             FileInputStream f1=new FileInputStream("abc.txt");
             FileOutputStream f2=new FileOutputStream("pqr.txt");

             int k;
             while((k=f1.read())!=-1)
             {
                 f2.write(k);
             }
             f1.close();
             f2.close();
             System.out.println("FILE COPY SUCCESSFULLY...");

         }catch(Exception e)
         {
             System.out.println(e);
         }
    }
}
