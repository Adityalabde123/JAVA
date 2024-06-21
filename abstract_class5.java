import java.util.*;
abstract class order{
     Scanner sc=new Scanner(System.in);
     int id;
     String description;
     abstract void accept();
     abstract void disp();
}
class purchase extends order{
    String custname;
    void accept()
    {
         System.out.println("enter purchase order id");
         id=sc.nextInt();
         System.out.println("enter order description");
         description=sc.next();
         System.out.println("enter customer name");
         custname=sc.next();
    }
    void disp()
    {
        System.out.println("id="+id);
        System.out.println("description="+description);
        System.out.println("customername="+custname);
    }
}
class salesorder extends order{
    String vendorname;
    void accept()
    {
         System.out.println("enter purchase order id");
         id=sc.nextInt();
         System.out.println("enter order description");
         description=sc.next();
         System.out.println("enter vendor name");
         vendorname=sc.next();
    }
    void disp()
    {
        System.out.println("id="+id);
        System.out.println("description="+description);
        System.out.println("vendorname="+vendorname);
    }
}
public class abstract_class5 {
    public static void main(String aaa[])
    {
         purchase ob1=new purchase();
         purchase ob2=new purchase();
         purchase ob3=new purchase();

         ob1.accept();
         ob2.accept();
         ob3.accept();

         ob1.disp();
         ob2.disp();
         ob3.disp();
         
         salesorder ob4=new salesorder();
         salesorder ob5=new salesorder();
         salesorder ob6=new salesorder();
         
         ob4.accept();
         ob5.accept();
         ob6.accept();

         ob4.disp();
         ob5.disp();
         ob6.disp();
    }
}
