import java.io.*;
public class file_handeling_cmd_arg2 {
    public static void main(String aaa[])throws Exception{
         FileReader f1=new FileReader(aaa[0]);
         FileWriter f2=new FileWriter(aaa[1]);

         BufferedReader br=new BufferedReader(f1);
         BufferedWriter bw=new BufferedWriter(f2);
         String s1="";
         while((s1=br.readLine())!=null)
         {  
            bw.write(s1+"\n");
           }
           br.close();
           bw.close();
           f1.close();
           f2.close();
          System.out.println("FILE COPY SUCCESSFULLY");
        }
    }