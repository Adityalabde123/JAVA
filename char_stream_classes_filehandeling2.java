//display each word in reverse oreder
import java.io.*;
public class char_stream_classes_filehandeling2 {
    public static void main(String aaa[])throws Exception
    {
         FileReader f1=new FileReader("file1.txt");
         BufferedReader br=new BufferedReader(f1);
         String s1="";
         while ((s1=br.readLine())!=null) {
            String s2[]=s1.split(" ");
            for(int i=0;i<s2.length;i++)
            {
                 StringBuffer sbr=new StringBuffer(s2[i]);
                 sbr.reverse();
                 System.out.println(sbr+"");
            }
            System.out.println();
         }
         f1.close();
    }    
}

               //anothor method OR

               //display each word in reverse oreder
/*import java.io.*;
public class char_stream_classes_filehandeling2 {
    public static void main(String aaa[])throws Exception
    {
         FileReader f1=new FileReader("file1.txt");
         BufferedReader br=new BufferedReader(f1);
         String s1="";
         while ((s1=br.readLine())!=null) {
           StringBuffer sbr=new StringBuffer(s2[i]);
           }
               sbr.reverse();
                 System.out.println(sbr+"");
            
            
         }
         f1.close();
    }    
}
    */