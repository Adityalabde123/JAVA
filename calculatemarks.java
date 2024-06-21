//calculate marks and pecentage
import java.util.Scanner;
public class calculatemarks {
      static class student{
        int rno, m1, m2, m3, m4, m5, tot;
        String sname;
        float per;

        void accept()
        {
             Scanner sc=new Scanner(System.in);
             System.out.print("enter student no");
             rno=sc.nextInt();
             System.out.println("enter student name");
             sname=sc.next();
             System.out.print("enter first subject mark:");
              m1=sc.nextInt();
             System.out.print("enter second subject mark:");
              m2=sc.nextInt();
             System.out.println("enter third subject mark:");
              m3=sc.nextInt();
             System.out.print("enter fourth subject mark:");
             m4=sc.nextInt();
             System.out.print("enter fifth subject mark:");
             m5=sc.nextInt();
          }
        void calculate()
        {
             tot=m1+m2+m3+m4+m5;
             per=(float)tot/5;
        }
        void disp()
        {
            System.out.println("student no="+rno);
            System.out.println("student name="+sname);
            System.out.println("student total marks="+tot);
            System.out.println("student per="+per);
        }
      }    
      static public void main(String aaa[])
      {
         student ob=new student();
         ob.accept();
         ob.calculate();
         ob.disp();  
      }
}
