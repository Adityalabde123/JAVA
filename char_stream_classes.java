import java.io.*;
public class char_stream_classes {
    public static void main(String aaa[])throws Exception
    {
         FileReader f1=new FileReader("abc.txt");
         BufferedReader br=new BufferedReader(f1);
         String s1="";
         while ((s1=br.readLine())!=null) {
            System.out.println(s1);
         }
         f1.close();
    }    
}
