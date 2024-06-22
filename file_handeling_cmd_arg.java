import java.io.*;
public class file_handeling_cmd_arg {
    public static void main(String aaa[])throws Exception
    {
         FileInputStream f1=new FileInputStream(aaa[0]);
         FileOutputStream f2=new FileOutputStream(aaa[1]);
         int k;
         while((k=f1.read())!=-1)
         {
             f2.write(k);
         }
         f1.close();
          f2.close();
        System.out.println("FILE COPY SUCCESSFULLY");
         }
}
