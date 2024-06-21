import java.util.*;
public class cricket_calculate {
   static class cricket{
    String name;
    int no_innings,notout,tot;
    float bat_avg;
     void  accept()
     {
         Scanner sc=new Scanner(System.in);
         System.out.print("enter player name");
         name=sc.next();
         
         System.out.print("enter player no of innings");
         no_innings=sc.nextInt();
         
         System.out.print("enter player notout");
         notout=sc.nextInt();
         
         System.out.print("enter player total runs");
         tot=sc.nextInt();
        }
      void calculate()
      {
         bat_avg=tot/notout;
      }
      void disp()
      {
         System.out.println("palyer name:" +name);
         System.out.println("palyer no of innings:" +no_innings);
         System.out.println("palyer notout:" +notout);
         System.out.println("palyer bat_avg:" +bat_avg);
      }
   }
   static public void main(String aaa[])
   {
       cricket ob=new cricket();
       ob.accept();
       ob.calculate();
       ob.disp();
   } 
}
