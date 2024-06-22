import java.util.*;
public class printing_date {
    public static void main(String aaa[])
    {
         Date d1=new Date();
         System.out.println("DATE & TIME="+d1);
    
         int dd=d1.getDate();
         int mm=d1.getMonth();
         int yy=d1.getYear();
         System.out.println("DATE="+dd+"/"+mm+"/"+yy);

         int hr=d1.getHours();
         int min=d1.getMinutes();
         int sec=d1.getSeconds();
         System.out.println("TIME="+hr+":"+min+":"+sec);

    }
}
