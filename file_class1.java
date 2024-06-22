import java.io.*;
public class file_class1 {
   public static void main(String aaa[])throws Exception{
     File f1=new File("abc.txt");
     if(f1.exists())
     {
         System.out.println("FOUND...");
         if(f1.isFile())
         System.out.println("it is a file");
         
         if(f1.isDirectory())
         System.out.println("it is a folder");
         
         if(f1.canRead())
         System.out.println("file permission Readable");

         if(f1.canWrite())
         System.out.println("file permission Writable");

         System.out.println("file name="+f1.getName());
         System.out.println("file Parent name="+f1.getParentFile());
         System.out.println("file full path="+f1.getAbsolutePath());
     }
   }    
}
