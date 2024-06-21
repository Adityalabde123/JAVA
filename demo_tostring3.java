import java.util.*;
class demo_tostring3{
    int rno;
    String sname;
    float per;
    static int cnt=0;
    demo_tostring3()
    {
         rno=1;
         sname="Aditya";
         per=78.3f;
    }
    demo_tostring3(int rno,String sname,float per)
    {
        cnt++;
        this.rno=rno;
        this.sname=sname;
        this.per=per;
    }
    public String toString()
    {
        return "\n object count="+cnt+"\n rollno="+rno+"name="+sname+"per="+per;
    }

 


    public static void main(String aaa[])
    {
        demo_tostring3 ob=new demo_tostring3(11,"aman",12.2f);
         System.out.println(ob);
         demo_tostring3 ob1=new demo_tostring3(12,"raj",70.8f);
         System.out.println(ob1);
         demo_tostring3 ob2=new demo_tostring3(13,"Sai",80.9f);
         System.out.println(ob2);
    }
}
