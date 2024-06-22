import java.util.*;
public class multilevel_inheritance5 {

          static class student{
            int rno;
            String sname;
            Scanner sc=new Scanner(System.in);
             void accepts()
             {
                System.out.println("enter rollno ");
                rno=sc.nextInt();
                System.out.println("enter student name ");
                sname=sc.next();
             }
          }
          static class exam extends student{
            int m1,m2,m3,m4,m5;
            
             void acceptm()
             {
                System.out.println("enter marks");
                m1=sc.nextInt();
                m2=sc.nextInt();
                m3=sc.nextInt();
                m4=sc.nextInt();
                m5=sc.nextInt();
             }
          }
          static class calculate extends exam{
            int tot;
            float per;
            
             void cal()
             {
                tot=m1+m2+m3+m4+m5;
                per=(float)tot/5;
             }
             void disp()
             {
                 System.out.println("roll no="+rno);
                 System.out.println("student name="+sname);
                 System.out.println("m1="+m1);
                 System.out.println("m2="+m2);
                 System.out.println("m3="+m1);
                 System.out.println("m4="+m1);
                 System.out.println("m5="+m5);
                 System.out.println("total="+tot);
                 System.out.println("per="+per);

             }
          }
          public static void main(String aaa[])
          {
            calculate ob=new calculate();
             ob.accepts();
             ob.acceptm();
             ob.cal();
             ob.disp();
          }
    }
        