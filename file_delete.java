//delete the file and count the deleted file
import java.io.*;
public class file_delete {
    public static void main(String aaa[])throws Exception{
    File f1=new file("d:\\demo");
    if(f1.isDirectory())
    {
        int cnt=0;
        String s1[]=f1.list();
        for(int i=0;i<s1.length;i++)
        {
             String fname=s1[i];
             if(fname.endswith(".class"));
             {
                File f2=new File(fname);
                f2.delete();
                cnt+=1;
             }
        }
        System.out.println("NUMBER OF FILES DELETED="+cnt);
    }
}
}