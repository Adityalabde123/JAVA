import java.io.*;
import java.util.*;
public class char_stream_classes_filehandeling4 {

    public static void main(String aaa[])throws Exception
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter source file");
         String s1=sc.nextLine();
         System.out.println("enter destination file");
         String s2=sc.nextLine();
         FileReader f1=new FileReader(s1);
         FileWriter f2=new FileWriter(s2);
         BufferedReader br=new BufferedReader(f1);
         BufferedWriter bw=new BufferedWriter(f2);
         String s="";
         while((s=br.readLine())!=null){
            bw.write(s+"\n");
         }
         br.close();
         bw.close();
         f1.close();
         f2.close();
         System.out.println("file copy successfully");

    }    
}
